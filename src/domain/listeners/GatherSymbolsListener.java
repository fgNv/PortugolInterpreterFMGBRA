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
import domain.ParameterComparison;
import domain.Symbols;
import domain.TypeData;
import domain.enums.EnumHelper;
import domain.enums.Type;
import helpers.ObjectRetriever;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Felipe
 */
public class GatherSymbolsListener extends PortugolBaseListener {

    public final List<Variable> variables = new ArrayList<>();
    public final List<Function> functions = new ArrayList<>();
    public final List<Parameter> parameters = new ArrayList<>();
    public final List<String> warnings = new ArrayList<>();
    public final List<String> errors = new ArrayList<>();
    public final List<String> unknownUsedIds = new ArrayList<>();
    private int currentScopeId;
    private int currentParamCount;
    private String currentFunctionName;
    private String currentVarDeclarationType;
    private int currentScopeDepth;
    private final Stack<Scope> scopeStack = new Stack<>();
    private final int GLOBAL_SCOPE_ID = 0;

    public GatherSymbolsListener() {
        scopeStack.push(new Scope("", 0, GLOBAL_SCOPE_ID));
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
    
    public Symbols getSymbols(){
        return new Symbols(variables,functions,parameters,errors, warnings);
    }

    private void checkDuplicatesOnDecVar(String token) {
        if (isThereAFunctionCalled(token)) {
            errors.add("Há uma função que já usa o nome \"" + token + "\"");
        }
        if (isThereAParamInCurrentFunctionCalled(token)) {
            errors.add("Há um parâmetro que já usa o nome \"" + token + "\"");
        }
        if (isThereAVariableCurrentScopeCalled(token)) {
            errors.add("Há uma variável que já usa o nome \"" + token + "\"");
        }
    }

    private void checkInitializationType(PortugolParser.DecSingleVarContext ctx, Variable var) {
        if (!ctx.getText().contains("=")) {
            return;
        }

        ExpressionTypeResolver expressionTypeResolver = new ExpressionTypeResolver();
        Type expectedType = EnumHelper.TipoFromString(currentVarDeclarationType);
        TypeData providedType = expressionTypeResolver.getExpressionType(ctx.expressao(), this);

        if (providedType == null) {
            return;
        }

        if (expectedType != providedType.getType()) {
            errors.add("Era esperado o tipo \"" + EnumHelper.asString(expectedType) + "\", mas foi encontrado \" " + EnumHelper.asString(providedType.getType()) + "\"");
        } else {
            var.setIsInitialized(true);
        }
    }

    private Variable registerVariable(PortugolParser.DecSingleVarContext ctx, TypeData typeData) {
        Variable var = new Variable(ctx.ID().getText(), scopeStack.peek().scopeId, typeData, scopeStack.peek().functionName);
        variables.add(var);
        return var;
    }

    @Override
    public void enterDecSingleVar(PortugolParser.DecSingleVarContext ctx) {
        if (ctx.ID() == null) {
            return;
        }
        checkDuplicatesOnDecVar(ctx.ID().getText());
        TypeData typeData = new TypeData(EnumHelper.TipoFromString(currentVarDeclarationType));
        Variable var = registerVariable(ctx, typeData);
        checkInitializationType(ctx, var);
    }

    @Override
    public void enterItemParamVetor(PortugolParser.ItemParamVetorContext ctx) {
        TypeData typeData = new TypeData(EnumHelper.TipoFromString(ctx.tipo().getText()), ctx.dimensao().size());

        Parameter var = new Parameter(ctx.ID().getText(), scopeStack.peek().scopeId, typeData, scopeStack.peek().functionName, currentParamCount);

        String cxtText = ctx.getText();

        currentParamCount++;
        var.setIsReference(true);

        if (cxtText.contains("=")) {
            var.setIsInitialized(true);
        }

        parameters.add(var);
    }

    @Override
    public void enterItemParamVar(PortugolParser.ItemParamVarContext ctx) {
        TypeData typeData = new TypeData(EnumHelper.TipoFromString(ctx.tipo().getText()));
        Parameter var = new Parameter(ctx.ID().getText(), scopeStack.peek().scopeId, typeData, scopeStack.peek().functionName, currentParamCount);

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

    Predicate<Variable> sameNameCurrentScope = (v) -> v.getScope() == scopeStack.peek().scopeId || v.getScope() == GLOBAL_SCOPE_ID;

    public boolean isThereAVariableCurrentScopeCalled(String name) {
        return variables.stream().filter(sameNameCurrentScope).anyMatch((v) -> v.getName().equals(name));
    }

    public boolean isThereAParamInCurrentFunctionCalled(String name) {
        return parameters.stream().anyMatch((v) -> v.getName().equals(name) && v.getFunction().equals(currentFunctionName));
    }

    private boolean isTokenDeclared(String token) {
        return isThereAFunctionCalled(token) || isThereAVariableCurrentScopeCalled(token) || isThereAParamInCurrentFunctionCalled(token);
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

        TypeData typeData = new TypeData(EnumHelper.TipoFromString(currentVarDeclarationType), ctx.dimensao().size());

        Variable vector = new Variable(id.getText(), scopeStack.peek().scopeId, typeData, scopeStack.peek().functionName);
        if (ctx.getText().contains("=")) {
            vector.setIsInitialized(true);
        }

        checkDuplicatesOnDecVar(id.getText());

        variables.add(vector);
    }

    private void verifyAttributionType(PortugolParser.AtribuicaoContext ctx) {
        String variableName = ctx.id_consumo().getText();

        if (!isThereAVariableCurrentScopeCalled(variableName)) {
            if (isThereAFunctionCalled(variableName)) {
                errors.add("Não se pode atribuir valores a funções");
            }
            return;
        }

        ObjectRetriever<Variable> o = new ObjectRetriever<>();

        Variable variable = o.getItemByName(variableName, variables);
        TypeData expectedType = variable.getTypeData();
        ExpressionTypeResolver expressionTypeResolver = new ExpressionTypeResolver();
        TypeData givenType = expressionTypeResolver.getExpressionType(ctx.expressao(), this);

        if (givenType != null && !expectedType.equals(givenType)) {
            errors.add("tipo esperado era \" " + expectedType.getDescription() + " \", \"" + givenType.getDescription() + "\" fornecido");
            return;
        }

        String alteredVariableName = ctx.id_consumo().getText();
        setVariableAsInitialized(alteredVariableName, variables);
        setVariableAsInitialized(alteredVariableName, parameters);
    }

    @Override
    public void enterAtribuicao(PortugolParser.AtribuicaoContext ctx) {
        verifyAttributionType(ctx);
    }

    private Optional<? extends Variable> getByToken(PortugolParser.Id_consumoContext id, List<? extends Variable> analysedVariables) {
        String variableName = id.getText();
        int scopeId = scopeStack.peek().scopeId;
        return analysedVariables.stream()
                .filter(i -> i.getName().equals(variableName) && i.getScope() == scopeId)
                .findFirst();
    }

    private void setItemAsUsed(PortugolParser.Id_consumoContext id, List<? extends Variable> analysedVariables) {
        Optional<? extends Variable> alteredVariable = getByToken(id, analysedVariables);

        if (alteredVariable.isPresent()) {
            alteredVariable.get().setIsUsed(true);
        }
    }

    private void verifyNonInitializedUse(PortugolParser.Id_consumoContext id, List<Variable> analysedVariables) {
        Optional<? extends Variable> alteredVariable = getByToken(id, analysedVariables);

        if (!alteredVariable.isPresent()) {
            return;
        }

        if (!alteredVariable.get().getIsInitialized() && !alteredVariable.get().getIsUsed()) {
            warnings.add("A variável \"" + id.getText() + "\" está sendo usada antes de ser inicializada.");
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

    public TypeData getFunctionType(String name) {
        Optional<Function> func = functions.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();

        if (func.isPresent()) {
            return func.get().getTypeData();
        }

        throw new RuntimeException("At \"getFunctionType\" function \"" + name + "\" was not found");
    }

    public TypeData getVariableType(String name) {
        Optional<Variable> variable = variables.stream()
                .filter(i -> i.getName().equals(name))
                .findFirst();

        if (variable.isPresent()) {
            return variable.get().getTypeData();
        }

        throw new RuntimeException("Variable \"" + name + "\" not found at \"getVariableTypes\"");
    }

    public TypeData getParamType(String name) {
        Optional<Parameter> parameter = parameters.stream()
                .filter(i -> i.getName().equals(name) && i.getFunction().equals(currentFunctionName))
                .findFirst();

        if (parameter.isPresent()) {
            return parameter.get().getTypeData();
        }

        throw new RuntimeException("Parameter \"" + name + "\" for function \"" + currentFunctionName + "\" not found at \"getVariableTypes\"");
    }

    @Override
    public void enterOperando(PortugolParser.OperandoContext ctx) {
        PortugolParser.Id_consumoContext id = ctx.id_consumo();
        Chamada_funcaoContext chamadaFuncao = ctx.chamada_funcao();

        if (chamadaFuncao != null) {
            setFunctionAsUsed(chamadaFuncao);
            return;
        }

        if (id == null) {
            return;
        }
        if (isThereAVariableCurrentScopeCalled(id.getText())) {
            verifyNonInitializedUse(id, variables);
            setItemAsUsed(id, variables);
        } else if (isThereAParamInCurrentFunctionCalled(currentFunctionName)) {
            setItemAsUsed(id, parameters);
        }
    }

    private Parameter BuildFakeParameter(PortugolParser.ExpressaoContext ctx, Integer position) {
        ExpressionTypeResolver etr = new ExpressionTypeResolver();
        Parameter result = new Parameter("$fake$", 0, etr.getExpressionType(ctx, this), "", position);
        return result;
    }

    private void verifyFunctionCallParameters(Chamada_funcaoContext ctx) {
        Optional<Function> functionOpt = functions.stream()
                .filter((i) -> i.getName().equals(ctx.id_consumo().getText()))
                .findFirst();

        if (!functionOpt.isPresent()) {
            return;
        }

        String functionName = functionOpt.get().getName();

        List<Parameter> expectedParameters = parameters.stream().filter(i -> i.getFunction().equals(functionName)).collect(Collectors.toList());

        long givenSize = ctx.param_funcao().expressao().stream().filter(i -> !i.getText().trim().equals("")).count();
        long expectedSize = expectedParameters.size();

        if (givenSize != expectedSize) {
            errors.add("Quantidade de parâmetros na chamada da função \"" + functionName + "\" deveria ser " + expectedSize + ", mas foi fornecido " + givenSize);
            return;
        }

        int position = 0;
        List<Parameter> givenParameters = new LinkedList<>();

        for (PortugolParser.ExpressaoContext e : ctx.param_funcao().expressao()) {
            givenParameters.add(BuildFakeParameter(e, position));
            position++;
        }

        List<ParameterComparison> comparison = ParameterComparison.buildCollection(expectedParameters, givenParameters);

        comparison.stream().filter(i -> !i.areParametersValid())
                .forEach(i -> errors.add("Na chamada da função \"" + i.getExpected().getFunction() + "\" era esperado o tipo " + i.getExpected().getType() + " no parâmetro nº" + i.getExpected().getParameterPosition()));
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
        currentVarDeclarationType = ctx.tipo().getText();

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

    private void registerFunction(PortugolParser.Dec_funcaoContext ctx){
        PortugolParser.TipoContext tipo = ctx.tipo();
        TypeData typeData;

        if (tipo != null) {
            if (ctx.dimensao() != null && ctx.dimensao().size() > 0) {
                typeData = new TypeData(EnumHelper.TipoFromString(tipo.getText()), ctx.dimensao().size());
            } else {
                typeData = new TypeData(EnumHelper.TipoFromString(tipo.getText()));
            }
        } else {
            typeData = new TypeData("vazio");
        }

        Function func = new Function(currentFunctionName, typeData);
        
        functions.add(func);
    }
    
    private void verifyFunctionNameDuplicity(){
        if(functions.stream().anyMatch((f) -> f.getName().equals(currentFunctionName))){
            errors.add("Já existe uma função que utiliza o nome \"" + currentFunctionName + "\"");
        }
    }
    
    @Override
    public void enterDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        if (ctx.ID() == null) {
            return;
        }
        String functionName = ctx.ID().getText();
        currentScopeId++;

        Scope scope = new Scope(functionName, 1, currentScopeId);
        scopeStack.push(scope);
        currentFunctionName = functionName;

        verifyFunctionNameDuplicity();
        registerFunction(ctx);
    }

    @Override
    public void exitDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        scopeStack.pop();
        currentFunctionName = "";
    }
}
