/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.listeners;

import domain.Variable;
import java.util.ArrayList;
import java.util.List;
import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;
import Antl4GeneratedMember.PortugolParser.Chamada_funcaoContext;
import Antl4GeneratedMember.PortugolParser.IdContext;
import domain.Function;
import domain.Parameter;
import java.util.Optional;
import java.util.Stack;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Felipe
 */
public class GatherSymbolsListener extends PortugolBaseListener {

    public final List<Variable> variables = new ArrayList<>();
    public final List<Function> functions = new ArrayList<>();
    public final List<Parameter> parameters = new ArrayList<>();
    public final List<String> errors = new ArrayList<>();
    private int currentScopeId;
    private int currentParamCount;
    private String currentType;
    private int currentScopeDepth;
    private final Stack<Scope> scopeStack = new Stack<>();

    public GatherSymbolsListener() {
        scopeStack.push(new Scope("", 0, 0));
        currentScopeDepth = 1;
    }

    public class Scope {

        public String functionName;
        public int scopeDepth;
        public int scopeId;

        public Scope(String functionName, int scopeDepth, int scopeId) {
            this.functionName = functionName;
            this.scopeDepth = scopeDepth;
            this.scopeId = scopeId;
        }
    }

    @Override
    public void enterItem_var(PortugolParser.Item_varContext ctx) {
        Variable var = new Variable(ctx.ID(0).getText(), scopeStack.peek().scopeId, currentType, scopeStack.peek().functionName);
        if (ctx.getText().contains("=")) {
            var.setIsInitialized(true);
        }

        variables.add(var);
    }

    @Override
    public void enterDec_item_param(PortugolParser.Dec_item_paramContext ctx) {
        Parameter var = new Parameter(ctx.ID().getText(), scopeStack.peek().scopeId, ctx.tipo().getText(), scopeStack.peek().functionName, currentParamCount);

        String cxtText = ctx.getText();

        currentParamCount++;
        if (cxtText.contains("&")) {
            var.setIsReference(true);
        }

        if (cxtText.contains("=")) {
            var.setIsInitialized(true);
        }

        parameters.add(var);
    }

    @Override
    public void enterDec_lista_param(PortugolParser.Dec_lista_paramContext ctx) {
        currentParamCount = 0;
    }

    private void verifyVariableIsInitialized(String alteredVariableName, List<? extends Variable> analysedVariables) {
        int scopeId = scopeStack.peek().scopeId;
        Optional<? extends Variable> alteredVariable = analysedVariables.stream()
                .filter(i -> i.getName().equals(alteredVariableName) && i.getScope() == scopeId)
                .findFirst();

        if (alteredVariable.isPresent()) {
            alteredVariable.get().setIsInitialized(true);
        }
    }

    @Override
    public void enterAtribuicao(PortugolParser.AtribuicaoContext ctx) {
        String alteredVariableName = ctx.id().getText();
        verifyVariableIsInitialized(alteredVariableName, variables);
        verifyVariableIsInitialized(alteredVariableName, parameters);
    }

    private void checkIfVariableIsUsed(IdContext id, List<? extends Variable> analysedVariables) {
        String variableName = id.getText();
        int scopeId = scopeStack.peek().scopeId;
        Optional<? extends Variable> alteredVariable = analysedVariables.stream()
                .filter(i -> i.getName().equals(variableName) && i.getScope() == scopeId)
                .findFirst();

        if (alteredVariable.isPresent()) {
            alteredVariable.get().setIsUsed(true);
        }
    }

    private void checkIfFunctionIsUsed(Chamada_funcaoContext functionCall) {
        TerminalNode currentProgramFunctionCall = functionCall.ID();
        if (currentProgramFunctionCall == null) {
            return;
        }

        String functionName = currentProgramFunctionCall.getText();
        Optional<Function> usedFunction = functions.stream()
                .filter(i -> i.getName().equals(functionName))
                .findFirst();

        if (usedFunction.isPresent()) {
            usedFunction.get().setIsUsed(true);
        }
    }

    @Override
    public void enterOperando(PortugolParser.OperandoContext ctx) {
        IdContext id = ctx.id();
        Chamada_funcaoContext chamadaFuncao = ctx.chamada_funcao();

        if (id != null) {
            checkIfVariableIsUsed(id, parameters);
            checkIfVariableIsUsed(id, variables);
        } else if (chamadaFuncao != null) {
            checkIfFunctionIsUsed(chamadaFuncao);
        }
    }

    @Override
    public void enterChamada_funcao(Chamada_funcaoContext ctx) {
        TerminalNode id = ctx.ID();
        if (id == null) {
            return;
        }
        checkIfFunctionIsUsed(ctx);
    }

    @Override
    public void enterDec_var(PortugolParser.Dec_varContext ctx) {
        currentType = ctx.tipo().getText();
    }

    @Override
    public void enterBloco(PortugolParser.BlocoContext ctx) {
        scopeStack.push(new Scope(scopeStack.peek().functionName, currentScopeDepth, currentScopeId));
        currentScopeId++;
        currentScopeDepth++;
    }

    @Override
    public void exitBloco(PortugolParser.BlocoContext ctx) {
        scopeStack.pop();
        currentScopeDepth--;
    }

    @Override
    public void enterDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        String functionName = ctx.ID().getText();
        currentScopeId++;

        Scope scope = new Scope(functionName, 1, currentScopeId);
        scopeStack.push(scope);

        PortugolParser.TipoContext tipo = ctx.tipo();
        String type;
        if (tipo != null) {
            type = tipo.getText();
        } else {
            type = "vazio";
        }

        Function func = new Function(functionName, type);
        functions.add(func);
    }

    @Override
    public void exitDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        scopeStack.pop();
    }
}
