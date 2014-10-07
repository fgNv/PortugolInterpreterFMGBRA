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
import domain.Function;
import domain.Parameter;
import java.util.Stack;

/**
 *
 * @author Felipe
 */
public class GatherSymbolsListener extends PortugolBaseListener {

    public final List<Variable> variables = new ArrayList<>();
    public final List<Function> functions = new ArrayList<>();
    public final List<Parameter> parameters = new ArrayList<>();
    private int currentScopeId;
    private int currentParamCount;
    private String currentFunctionName;
    private String currentType;
    private int currentScopeDepth;
    private final Stack<Scope> scopeStack = new Stack<>();

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
        Variable var = new Variable(ctx.ID(0).getText(), scopeStack.peek().scopeId, currentType, currentFunctionName);
        variables.add(var);
    }

    @Override
    public void enterDec_item_param(PortugolParser.Dec_item_paramContext ctx) {
        Parameter var = new Parameter(ctx.ID().getText(), scopeStack.peek().scopeId, ctx.tipo().getText(), currentFunctionName, currentParamCount);

        currentParamCount++;
        if (ctx.getText().contains("&")) {
            var.setIsReference(true);
        }

        variables.add(var);
    }

    @Override
    public void enterDec_lista_param(PortugolParser.Dec_lista_paramContext ctx) {
        currentParamCount = 0;
    }

    @Override
    public void enterDec_var(PortugolParser.Dec_varContext ctx) {
        currentType = ctx.tipo().getText();
    }

    @Override
    public void enterBloco(PortugolParser.BlocoContext ctx) {
        if (currentScopeDepth > 0) {
            scopeStack.push(new Scope(currentFunctionName, currentScopeDepth, currentScopeId));
            currentScopeId++;
        }

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

        Scope scope = new Scope(functionName, 0, currentScopeId);
        scopeStack.push(scope);

        PortugolParser.TipoContext tipo = ctx.tipo();
        String type;
        if (tipo != null) {
            type = tipo.getText();
        } else {
            type = "vazio";
        }

        Function func = new Function(functionName, type);
        currentFunctionName = functionName;
        functions.add(func);
    }
}
