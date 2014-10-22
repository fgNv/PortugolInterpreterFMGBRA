package domain.listeners;

import domain.Variable;
import java.util.ArrayList;
import java.util.List;
import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;
import Antl4GeneratedMember.PortugolParser.Chamada_funcaoContext;
import domain.ExpressionTypeResolver;
import domain.Function;
import domain.Parameter;
import domain.Vector;
import domain.enums.EnumHelper;
import domain.enums.Tipo;
import helpers.ObjectRetriever;
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
    public final List<Vector> vectors = new ArrayList<>();
    public final List<Parameter> parameters = new ArrayList<>();
    public final List<String> errors = new ArrayList<>();
    public final List<String> unknownUsedIds = new ArrayList<>();
    private int currentScopeId;
    private int currentParamCount;
    private String currentFunctionName;
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
    public void enterDecVar(PortugolParser.DecVarContext ctx) {
        TerminalNode id = ctx.ID();
        if (id == null) {
            return;
        }

        Variable var = new Variable(id.getText(), scopeStack.peek().scopeId, currentType, scopeStack.peek().functionName);

        if (ctx.getText().contains("=")) {
            ExpressionTypeResolver expressionTypeResolver = new ExpressionTypeResolver();
            Tipo expectedType = EnumHelper.TipoFromString(currentType);
            Tipo providedType = expressionTypeResolver.getExpressionType(ctx.expressao(), this);

            if (expectedType != providedType) {
                errors.add("Era esperado o tipo \"" + EnumHelper.asString(expectedType) + "\", mas foi encontrado \" " + EnumHelper.asString(providedType) + "\"");
            } else {
                var.setIsInitialized(true);
            }
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

    public boolean isThereAFunctionCalled(String name) {
        return functions.stream().anyMatch((v) -> v.getName().equals(name));
    }

    public boolean isThereAVariableCurrentScopeCalled(String name) {
        return variables.stream().anyMatch((v) -> v.getName().equals(name) && v.getScope() == scopeStack.peek().scopeId);
    }

    public boolean isThereAParamCalled(String name) {
        return parameters.stream().anyMatch((v) -> v.getName().equals(name) && v.getFunction().equals(currentFunctionName));
    }

    private boolean isTokenDeclared(String token) {
        return isThereAFunctionCalled(token) || isThereAVariableCurrentScopeCalled(token) || isThereAParamCalled(token);
    }

    @Override
    public void enterId_consumo(PortugolParser.Id_consumoContext ctx) {
        String idText = ctx.ID().getText();
        if (!isTokenDeclared(idText)) {
            if (!unknownUsedIds.stream().anyMatch((v) -> v.equals(idText))) {
                unknownUsedIds.add(idText);
            }
            errors.add("Token " + idText + " não foi declarado");
        }
    }

    @Override
    public void enterDec_lista_param(PortugolParser.Dec_lista_paramContext ctx) {
        currentParamCount = 0;
    }

    private void setVariableAsInitialized(String alteredVariableName, List<? extends Variable> analysedVariables) {
        int scopeId = scopeStack.peek().scopeId;
        Optional<? extends Variable> alteredVariable = analysedVariables.stream()
                .filter(i -> i.getName().equals(alteredVariableName) && i.getScope() == scopeId)
                .findFirst();

        if (alteredVariable.isPresent()) {
            alteredVariable.get().setIsInitialized(true);
        }
    }

    @Override
    public void enterDecVetor(PortugolParser.DecVetorContext ctx) {
        TerminalNode id = ctx.ID();
        if (id == null) {
            return;
        }

        int dimensionsCount = ctx.dimensao().size();

        Vector vector = new Vector(dimensionsCount, id.getText(), scopeStack.peek().scopeId, currentType, scopeStack.peek().functionName);
        if (ctx.getText().contains("=")) {
            vector.setIsInitialized(true);
        }

        vectors.add(vector);
    }

    @Override
    public void enterAtribuicao(PortugolParser.AtribuicaoContext ctx) {

        String variableName = ctx.id_consumo().getText();

        if (!isThereAVariableCurrentScopeCalled(variableName)) {
            return;
        }

        ObjectRetriever<Variable> o = new ObjectRetriever<>();

        Variable variable = o.getItemByName(variableName, variables);
        String expectedType = variable.getType();
        ExpressionTypeResolver expressionTypeResolver = new ExpressionTypeResolver();
        String givenType = EnumHelper.asString(expressionTypeResolver.getExpressionType(ctx.expressao(), this));

        if (givenType != null && !expectedType.equals(givenType)) {
            errors.add("tipo esperado era \" " + expectedType + " \", \"" + givenType + "\" fornecido");
            return;
        }

        String alteredVariableName = ctx.id_consumo().getText();
        setVariableAsInitialized(alteredVariableName, variables);
        setVariableAsInitialized(alteredVariableName, parameters);
    }

    private void setVariableAsUsed(PortugolParser.Id_consumoContext id, List<? extends Variable> analysedVariables) {
        String variableName = id.getText();
        int scopeId = scopeStack.peek().scopeId;
        Optional<? extends Variable> alteredVariable = analysedVariables.stream()
                .filter(i -> i.getName().equals(variableName) && i.getScope() == scopeId)
                .findFirst();

        if (alteredVariable.isPresent()) {
            alteredVariable.get().setIsUsed(true);
        }
    }

    private void setFunctionAsUsed(Chamada_funcaoContext functionCall) {
        PortugolParser.Id_consumoContext currentProgramFunctionCall = functionCall.id_consumo();
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

    public Tipo getFunctionType(String name) {
        Optional<Function> func = functions.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();

        if (func.isPresent()) {
            return EnumHelper.TipoFromString(func.get().getType());
        }

        throw new RuntimeException("At \"getFunctionType\" function \"" + name + "\" was not found");
    }

    public String getVariableType(String name) {
        Optional<Variable> variable = variables.stream()
                .filter(i -> i.getName().equals(name))
                .findFirst();

        if (variable.isPresent()) {
            return variable.get().getType();
        }

        throw new RuntimeException("Variable \"" + name + "\" not found at \"getVariableTypes\"");
    }

    public String getParamType(String name) {
        Optional<Parameter> parameter = parameters.stream()
                .filter(i -> i.getName().equals(name) && i.getFunction().equals(currentFunctionName))
                .findFirst();

        if (parameter.isPresent()) {
            return parameter.get().getType();
        }

        throw new RuntimeException("Parameter \"" + name + "\" for function \"" + currentFunctionName + "\" not found at \"getVariableTypes\"");
    }

    @Override
    public void enterOperando(PortugolParser.OperandoContext ctx) {
        PortugolParser.Id_consumoContext id = ctx.id_consumo();
        Chamada_funcaoContext chamadaFuncao = ctx.chamada_funcao();

        if (id != null) {
            setVariableAsUsed(id, parameters);
            setVariableAsUsed(id, variables);
        } else if (chamadaFuncao != null) {
            setFunctionAsUsed(chamadaFuncao);
        }
    }

    private void verifyFunctionCallParameters(Chamada_funcaoContext ctx) {
        Optional<Function> functionOpt = functions.stream()
                .filter((i) -> i.getName().equals(ctx.id_consumo().getText()))
                .findFirst();

        if (!functionOpt.isPresent()) {
            return;
        }

        ctx.param_funcao().expressao();
    }

    @Override
    public void enterChamada_funcao(Chamada_funcaoContext ctx) {
        PortugolParser.Id_consumoContext id = ctx.id_consumo();
        if (id == null) {
            return;
        }
        setFunctionAsUsed(ctx);
        verifyFunctionCallParameters(ctx);
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
        currentFunctionName = functionName;

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
        currentFunctionName = "";
    }
}
