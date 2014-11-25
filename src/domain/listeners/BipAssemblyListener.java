/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.listeners;

import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;
import Antl4GeneratedMember.PortugolParser.Id_consumoContext;
import domain.Symbols;
import domain.assemblyResolver.AttributionResolver;
import domain.assemblyResolver.IResolver;
import domain.assemblyResolver.OperandoResolver;

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
//    private List<String> temporaryVariables = new ArrayList<>();

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
            ResolveConstantValueLoad(operando.valor_constante());
            return;
        }

        if (operando.id_consumo() != null) {
            resolveVariableLoad(operando.id_consumo());
            return;
        }

        throw new RuntimeException("not implemented");
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

        throw new RuntimeException("not implemented");
    }

    @Override
    public void exitExpressao(PortugolParser.ExpressaoContext ctx) {
        if (isInEscreva) {
            text += globalResolver.resolve();
            globalResolver = new AttributionResolver(identation + "STO $out_port \n");
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
        text += globalResolver.resolve();
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
        //      this.symbols = symbols;
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
}
