/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.listeners;

import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;
import domain.assemblyResolver.AttributionResolver;
import domain.assemblyResolver.IResolver;
import domain.assemblyResolver.OperandoResolver;

/**
 *
 * @author Felipe
 */
public class PortugolAssemblyListener extends PortugolBaseListener {

    private IResolver expressionResolver;
    private final String newline = System.getProperty("line.separator");
    private String assembly = "";
    private String currentOperation = null;
    private boolean firstOperandoAdded = false;

    @Override
    public void enterAlteracaoAtribuicao(PortugolParser.AlteracaoAtribuicaoContext ctx) {
        String variableName = ctx.atribuicao().id_consumo().ID().getText();
        String cmd = "STO " + variableName + newline;
        expressionResolver = new AttributionResolver(cmd);
    }

    private void resolveConstantValue(PortugolParser.Valor_constanteContext ctx) {
        String valorConstante = ctx.getText();
        if (!firstOperandoAdded) {
            String cmd = "LDI " + valorConstante + newline;
            IResolver resolver = new OperandoResolver(cmd);
            expressionResolver.setNext(resolver);
            if (currentOperation != null) {
                firstOperandoAdded = true;
            }
        } else {
            String cmd = currentOperation + "I " + valorConstante + newline;
            IResolver resolver = new OperandoResolver(cmd);
            expressionResolver.setNext(resolver);
        }
    }

    private void resolveOperando(PortugolParser.OperandoContext operando) {
        if (operando.valor_constante() != null) {
            resolveConstantValue(operando.valor_constante());
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

    public String getAssembly() {
        return assembly;
    }

    @Override
    public void exitAlteracaoAtribuicao(PortugolParser.AlteracaoAtribuicaoContext ctx) {
        assembly += expressionResolver.resolve();
        expressionResolver = null;
    }

}
