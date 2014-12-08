/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.listeners;

import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;
import Antl4GeneratedMember.PortugolParser.Id_consumoContext;
import domain.enums.IfState;
import domain.Symbols;
import domain.assemblyResolver.AttributionResolver;
import domain.assemblyResolver.IResolver;
import domain.assemblyResolver.OperandoResolver;
import domain.enums.WhileState;

/**
 *
 * @author Felipe
 */
public class BipAssemblyListener extends PortugolBaseListener implements IAssemblyGeneratorListener {

    private IResolver globalResolver;
    private final String newline = System.getProperty("line.separator");
    private String text = ".text" + newline;
    private String data = "";
    private String currentOperation = null;
    private boolean firstOperandoAdded = false;
    private final String identation = "    ";
    private boolean isInEscreva = false;
    private IfState ifState = IfState.None;
    private int currentLabelLevel = 1;
    private int currentTemp = 1;
    String ifFirstBlock = "";
    String ifSecondBlock = "";
    WhileState whileState = WhileState.none;

    private void initAttribution(String variableName) {
        String cmd = identation + "STO " + variableName + newline;
        globalResolver = new AttributionResolver(cmd);
    }

    @Override
    public void enterAlteracaoAtribuicao(PortugolParser.AlteracaoAtribuicaoContext ctx) {
        String variableName = ctx.atribuicao().id_consumo().ID().getText();
        initAttribution(variableName);
    }

    private void ResolveConstantValueLoad(PortugolParser.Valor_constanteContext ctx) {
        String valorConstante = ctx.getText();
        if (!firstOperandoAdded) {
            String cmd = identation + "LDI " + valorConstante + newline;
            IResolver resolver = new OperandoResolver(cmd);
            globalResolver.setNext(resolver);
            if (currentOperation != null) {
                firstOperandoAdded = true;
            }
        } else {
            String cmd = identation + currentOperation + "I " + valorConstante + newline;
            IResolver resolver = new OperandoResolver(cmd);
            globalResolver.setNext(resolver);
        }
    }

    private void resolveVariableLoad(Id_consumoContext ctx) {
        String variableId = ctx.ID().getText();
        if (!firstOperandoAdded) {
            String cmd = identation + "LD " + variableId + newline;
            IResolver resolver = new OperandoResolver(cmd);
            globalResolver.setNext(resolver);
            if (currentOperation != null) {
                firstOperandoAdded = true;
            }
        } else {
            String cmd = identation + currentOperation + " " + variableId + newline;
            IResolver resolver = new OperandoResolver(cmd);
            globalResolver.setNext(resolver);
        }
    }

    private void resolveOperando(PortugolParser.OperandoContext operando) {

        if (operando.valor_constante() != null) {
            if (ifState == IfState.SingleBlock || ifState == IfState.Expression || whileState == WhileState.expression) {
                text += identation + "LDI " + operando.valor_constante().getText() + newline;
                text += identation + "STO temp" + currentTemp + newline;
                currentTemp++;
            } else {
                ResolveConstantValueLoad(operando.valor_constante());
            }
            return;
        }

        if (operando.id_consumo() != null) {
            if (ifState == IfState.SingleBlock || ifState == IfState.Expression || whileState == WhileState.expression) {
                text += identation + "LD " + operando.id_consumo().getText() + newline;
                text += identation + "STO temp" + currentTemp + newline;
                currentTemp++;
            } else {
                resolveVariableLoad(operando.id_consumo());
            }
            return;
        }

        throw new RuntimeException("not implemented");
    }

    private String ResolvePriorityComparisonOperationIf(String operator) {
        switch (operator) {
            case "<":
                return "BGE";
            case "<=":
                return "BGT";
            case ">":
                return "BLE";
            case ">=":
                return "BLT";
            default:
                throw new RuntimeException("Invalid operator " + operator + " on priority comparison resolver");
        }
    }

    private String ResolveSecondaryComparisonOperation(String operator) {
        switch (operator) {
            case "==":
                return "BNQ";
            case "!=":
                return "BEQ";
            default:
                throw new RuntimeException("Invalid operator " + operator + " on secondary comparison resolver");
        }
    }

    @Override
    public void enterExpressao(PortugolParser.ExpressaoContext ctx) {

        if (ctx.operando() != null) {
            resolveOperando(ctx.operando());
            return;
        }

        if (ctx.operador_aritmetico_secundario_concatenacao() != null) {
            currentOperation = "ADD";
            return;
        }

        if (ctx.operador_aritmetico_secundario() != null) {
            currentOperation = "SUB";
            return;
        }

        boolean useIfComparisonResolver = ifState == IfState.SingleBlock || ifState == IfState.Expression || whileState == WhileState.expression;

        if (ctx.operador_comparacao_prioritario() != null) {
            if (useIfComparisonResolver) {
                currentOperation = ResolvePriorityComparisonOperationIf(ctx.operador_comparacao_prioritario().getText());
            }
            return;
        }

        if (ctx.operador_comparacao_secundario() != null) {
            if (useIfComparisonResolver) {
                currentOperation = ResolveSecondaryComparisonOperation(ctx.operador_comparacao_secundario().getText());
            }
            return;
        }

        throw new RuntimeException("not implemented");
    }

    @Override
    public void exitItem_param(PortugolParser.Item_paramContext ctx) {
        if (isInEscreva) {
            text += globalResolver.resolve();
            firstOperandoAdded = false;
            globalResolver = new AttributionResolver(identation + "STO $out_port\n");
        }
    }

    public String getAssembly() {
        return text;
    }

    @Override
    public void enterDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        this.text += identation + "_" + ctx.ID().getText() + ":" + newline;
    }

    private void ResolveAttribution() {
        if (ifState == IfState.FirstBlock) {
            ifFirstBlock += globalResolver.resolve();
        } else {
            text += globalResolver.resolve();
        }
        globalResolver = null;
        currentOperation = null;
        firstOperandoAdded = false;
    }

    @Override
    public void exitAlteracaoAtribuicao(PortugolParser.AlteracaoAtribuicaoContext ctx) {
        ResolveAttribution();
    }

    @Override
    public void SetSymbolTable(Symbols symbols) {
        this.data = ".data" + newline;
        this.data += symbols.variables.stream().map(i -> i.getName()).reduce("", (c, i) -> c + identation + i + " : 0" + newline);
        this.data += symbols.parameters.stream().map(i -> i.getName()).reduce("", (c, i) -> c + identation + i + " : 0" + newline);
    }

    @Override
    public String getText() {
        return newline + data + text + identation + "HLT 0";
    }

    @Override
    public PortugolBaseListener getListener() {
        return this;
    }

    @Override
    public void enterLeia(PortugolParser.LeiaContext ctx) {
        String cmds = ctx.ID().stream()
                .map(x -> identation + "LD $in_port" + "\n" + identation + "STO " + x.getText() + "\n")
                .reduce("", (acc, i) -> acc + i);

        text += cmds;
    }

    private void AddIfEvaluationAssembly() {
        text += identation + "LD temp" + (currentTemp - 2) + newline;
        text += identation + "SUB temp" + (currentTemp - 1) + newline;
        text += identation + currentOperation + " R" + currentLabelLevel + newline;
    }

    private void AddWhileEvaluationAssembly() {
        text += identation + "LD temp" + (currentTemp - 2) + newline;
        text += identation + "SUB temp" + (currentTemp - 1) + newline;
        text += identation + currentOperation + " R" + (currentLabelLevel + 1) + newline;
    }

    @Override
    public void enterBloco(PortugolParser.BlocoContext ctx) {
        if (ifState == IfState.None && whileState == WhileState.none) {
            return;
        }

        if (whileState == WhileState.expression) {
            AddWhileEvaluationAssembly();
            whileState = WhileState.block;
            return;
        }

        if (ifState == IfState.Expression) {
            AddIfEvaluationAssembly();
            ifFirstBlock = "R" + currentLabelLevel + ":" +newline;
            ifState = IfState.FirstBlock;
            return;
        }

        if (ifState == IfState.SingleBlock) {
            AddIfEvaluationAssembly();
            ifState = IfState.EndedSingleBlock;
        }

        if (ifState == IfState.FirstBlock) {
            ifState = IfState.SecondBlock;
        }
    }

    @Override
    public void exitBloco(PortugolParser.BlocoContext ctx) {
        if (ifState == IfState.None && whileState == WhileState.none) {
            return;
        }

        if (whileState == WhileState.block) {
            text +=  identation + "JMP R" + currentLabelLevel +  newline;
            currentLabelLevel++;
            text += "R" + currentLabelLevel + ":" + newline;
        }

        if (ifState == IfState.EndedSingleBlock) {
            text += "R" + currentLabelLevel + ":" + newline;
        }

        if (ifState == IfState.SecondBlock) {
            text += identation + "JMP R" + currentLabelLevel + newline;
            text += ifFirstBlock;
            text += "R" + currentLabelLevel + ":" + newline;
            ifState = IfState.None;
        }

        currentLabelLevel++;
    }

    @Override
    public void enterEscreva(PortugolParser.EscrevaContext ctx) {
        isInEscreva = true;
        globalResolver = new AttributionResolver(identation + "STO $out_port\n");
    }

    @Override
    public void exitEscreva(PortugolParser.EscrevaContext ctx) {
        isInEscreva = false;
    }

    @Override
    public void enterSe(PortugolParser.SeContext ctx) {
        if (ctx.bloco().size() == 1) {
            ifState = IfState.SingleBlock;
        } else {
            ifState = IfState.Expression;
        }
        globalResolver = new AttributionResolver("");
    }

    @Override
    public void exitSe(PortugolParser.SeContext ctx) {
        ifState = IfState.None;
        currentTemp = 1;
    }

    @Override
    public void enterDecSingleVar(PortugolParser.DecSingleVarContext ctx) {
        if (ctx.expressao() != null) {
            String variableName = ctx.ID().getText();
            initAttribution(variableName);
        }
    }

    @Override
    public void exitDecSingleVar(PortugolParser.DecSingleVarContext ctx) {
        if (globalResolver != null) {
            ResolveAttribution();
        }
    }

    @Override
    public void enterEnquanto(PortugolParser.EnquantoContext ctx) {
        text += "R" + currentLabelLevel + ":" + newline;
        whileState = WhileState.expression;
    }

    @Override
    public void exitEnquanto(PortugolParser.EnquantoContext ctx) {
        whileState = WhileState.none;
    }

}
