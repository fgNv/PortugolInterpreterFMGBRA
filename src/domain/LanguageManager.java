package domain;

import Antl4GeneratedMember.PortugolBaseListener;
import domain.errorHandlers.LexiconErrorMessageStoreHandler;
import domain.errorHandlers.SyntactictErrorMessageStoreHandler;
import domain.listeners.GatherSymbolsListener;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Felipe
 */
public class LanguageManager {

    private void arrangeErrorListeners(LanguageTools tools, List<String> errors) {

        LexiconErrorMessageStoreHandler tratadorErrosLexico = new LexiconErrorMessageStoreHandler(errors);
        SyntactictErrorMessageStoreHandler tratadorErrosSintatico = new SyntactictErrorMessageStoreHandler(errors);

        tools.lexer.removeErrorListeners();
        tools.parser.removeErrorListeners();

        tools.lexer.addErrorListener(tratadorErrosLexico);
        tools.parser.addErrorListener(tratadorErrosSintatico);
    }

    public ParserRuleContext GetTree(String input) {
        LanguageTools tools = new LanguageTools(input);
        ParserRuleContext tree = tools.parser.programa();
        return tree;
    }

    public GatherSymbolsListener GetListener(String input){
        GatherSymbolsListener gatherSymbolsListener = new GatherSymbolsListener();
        LanguageTools tools = new LanguageTools(input);
        arrangeErrorListeners(tools, gatherSymbolsListener.errors);
        ParserRuleContext tree = tools.parser.programa();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(gatherSymbolsListener, tree);
        return gatherSymbolsListener;
    }
    
    public Symbols GetVariableList(String input) {
        GatherSymbolsListener gatherSymbolsListener = GetListener(input);
        Symbols result = new Symbols(gatherSymbolsListener.variables, gatherSymbolsListener.functions, gatherSymbolsListener.parameters, gatherSymbolsListener.errors, gatherSymbolsListener.warnings);
        return result;
    }
}
