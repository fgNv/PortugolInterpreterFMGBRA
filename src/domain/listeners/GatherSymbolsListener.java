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

/**
 *
 * @author Felipe
 */
public class GatherSymbolsListener extends PortugolBaseListener {

    public final List<Variable> variables = new ArrayList<>();
    public final List<String> functions = new ArrayList<>();
    private int currentScopeLevel;
    private String currentFunctionName;
    private String currentType;

    @Override
    public void enterItem_var(PortugolParser.Item_varContext ctx) {
        Variable var = new Variable(ctx.ID(0).getText(), currentScopeLevel, currentType, currentFunctionName);
        variables.add(var);
    }

    @Override
    public void enterDec_var(PortugolParser.Dec_varContext ctx) {
        currentType = ctx.tipo().getText();
    }

    @Override
    public void enterBloco(PortugolParser.BlocoContext ctx) {
        currentScopeLevel++;
    }

    @Override
    public void exitBloco(PortugolParser.BlocoContext ctx) {
        currentScopeLevel--;
    }
    
    @Override
    public void enterDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        String functionName = ctx.ID().getText();        
        currentFunctionName = functionName;        
        functions.add(functionName);
    }    
}
