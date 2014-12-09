/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.listeners;

import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;
import Antl4GeneratedMember.PortugolParser.Id_consumoContext;
import domain.DoWhileState;
import domain.ForState;
import domain.enums.IfState;
import domain.Symbols;
import domain.assemblyResolver.AttributionResolver;
import domain.assemblyResolver.IResolver;
import domain.assemblyResolver.OperandoResolver;
import domain.enums.WhileState;
import java.util.Stack;

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
    private DoWhileState doWhileState = DoWhileState.none;
    private int currentLabelLevel = 1;
    private int currentTemp = 1;
    String ifFirstBlock = "";
    String ifSecondBlock = "";
    String initFor = "";
    String incrementFor = "";
    String blockFor = "";
    String evaluationFor = "";
    private Stack<Integer> labelStack = new Stack<>();
    WhileState whileState = WhileState.none;
    ForState forState = ForState.none;

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

        boolean isInJumpEvalExp = ifState == IfState.SingleBlock || ifState == IfState.Expression || whileState == WhileState.expression || doWhileState == DoWhileState.expression;

        if (operando.valor_constante() != null) {
            if (isInJumpEvalExp) {
                text += identation + "LDI " + operando.valor_constante().getText() + newline;
                text += identation + "STO temp" + currentTemp + newline;
                currentTemp++;
            } else {
                ResolveConstantValueLoad(operando.valor_constante());
            }
            return;
        }

        if (operando.id_consumo() != null) {
            if (isInJumpEvalExp) {
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

    private String ResolvePriorityComparisonOperationDoWhile(String operator) {
        switch (operator) {
            case "<":
                return "BLT";
            case "<=":
                return "BLE";
            case ">":
                return "BGT";
            case ">=":
                return "BGE";
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
        boolean useDoWhileComparisonResolver = doWhileState == DoWhileState.expression;

        if (ctx.operador_comparacao_prioritario() != null) {
            if (useIfComparisonResolver) {
                currentOperation = ResolvePriorityComparisonOperationIf(ctx.operador_comparacao_prioritario().getText());
            }
            if (useDoWhileComparisonResolver) {
                currentOperation = ResolvePriorityComparisonOperationDoWhile(ctx.operador_comparacao_prioritario().getText());
            }
            return;
        }

        if (ctx.operador_comparacao_secundario() != null) {
            if (useIfComparisonResolver) {
                currentOperation = ResolveSecondaryComparisonOperation(ctx.operador_comparacao_secundario().getText());
            }
            if (useDoWhileComparisonResolver) {
                currentOperation = ResolvePriorityComparisonOperationDoWhile(ctx.operador_comparacao_prioritario().getText());
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
        } else if (forState == ForState.increment) {
            incrementFor += globalResolver.resolve();
        } else if (forState == ForState.block) {
            blockFor += globalResolver.resolve();
        } else if (forState == ForState.evaluation) {
            evaluationFor += globalResolver.resolve();
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

    private void AddBrenchEvaluationAssembly(int labelLevel) {
        text += identation + "LD temp" + (currentTemp - 2) + newline;
        text += identation + "SUB temp" + (currentTemp - 1) + newline;
        text += identation + currentOperation + " R" + labelLevel + newline;
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
            AddBrenchEvaluationAssembly(currentLabelLevel);
            ifFirstBlock = "R" + currentLabelLevel + ":" + newline;
            ifState = IfState.FirstBlock;
            return;
        }

        if (ifState == IfState.SingleBlock) {
            AddBrenchEvaluationAssembly(currentLabelLevel);
            ifState = IfState.EndedSingleBlock;
        }

        if (ifState == IfState.FirstBlock) {
            ifState = IfState.SecondBlock;
        }
    }

    @Override
    public void exitBloco(PortugolParser.BlocoContext ctx) {

        if (whileState == WhileState.block) {
            text += identation + "JMP R" + currentLabelLevel + newline;
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

        if (doWhileState == DoWhileState.block) {
            doWhileState = DoWhileState.expression;
            globalResolver = new AttributionResolver("");
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

    @Override
    public void enterFaca(PortugolParser.FacaContext ctx) {
        text += "R" + currentLabelLevel + ":" + newline;
        doWhileState = DoWhileState.block;
    }

    @Override
    public void exitFaca(PortugolParser.FacaContext ctx) {
        doWhileState = DoWhileState.none;
        AddBrenchEvaluationAssembly(currentLabelLevel - 1);
    }

//    @Override
//    public void exitPara(PortugolParser.ParaContext ctx) {
//        text += 
//    }
    
    @Override
    public void enterContador_para(PortugolParser.Contador_paraContext ctx) {
        forState = ForState.init;
        String variableName = ctx.ID().getText();
        String cmd = identation + "STO " + variableName + newline;
        globalResolver = new AttributionResolver(cmd);
        forState = ForState.init;
    }

    @Override
    public void exitContador_para(PortugolParser.Contador_paraContext ctx) {
        forState = ForState.increment;
        text += "R" + currentLabelLevel + ":" + newline;
    }
}
