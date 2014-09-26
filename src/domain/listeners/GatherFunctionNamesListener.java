/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.listeners;

import java.util.ArrayList;
import java.util.List;
import Antl4GeneratedMember.PortugolBaseListener;
import Antl4GeneratedMember.PortugolParser;

/**
 *
 * @author Felipe
 */
public class GatherFunctionNamesListener extends PortugolBaseListener {

    public final List<String> functions = new ArrayList<>();    

    @Override
    public void enterDec_funcao(PortugolParser.Dec_funcaoContext ctx) {
        String functionName = ctx.ID().getText();
        functions.add(functionName);
    }    
}
