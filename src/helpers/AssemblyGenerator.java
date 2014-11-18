/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import domain.LanguageTools;
import domain.Symbols;
import domain.listeners.IAssemblyGeneratorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Felipe
 */
public class AssemblyGenerator {
    private final IAssemblyGeneratorListener assemblyGeneratorListener;
    private final String input;
        
    public AssemblyGenerator(IAssemblyGeneratorListener assemblyGeneratorListener, Symbols symbols, String input) {
        this.assemblyGeneratorListener = assemblyGeneratorListener;
        this.assemblyGeneratorListener.SetSymbolTable(symbols);
        this.input = input;
    }
    
    public String generateAssembly(){
        LanguageTools tools = new LanguageTools(input);
        ParserRuleContext tree = tools.parser.programa();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(assemblyGeneratorListener.getListener(), tree);
        return assemblyGeneratorListener.getText();
    }
}
