package domain;

import domain.errorHandlers.LexiconErrorHandler;
import domain.errorHandlers.SyntactictErrorHandler;
import domain.listeners.GatherSymbolsListener;
import java.util.ArrayList;
import java.util.List;
import Antl4GeneratedMember.PortugolLexer;
import Antl4GeneratedMember.PortugolParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Felipe
 */
public class LanguageManager {

    private class Tools {

        public PortugolLexer lexer;
        public PortugolParser parser;

        public Tools(String input) {
            ANTLRInputStream ais = new ANTLRInputStream(input);
            lexer = new PortugolLexer(ais);
            CommonTokenStream stream = new CommonTokenStream(lexer);
            parser = new PortugolParser(stream);
        }
    }

    public List<String> Validate(String input) {
        Tools tools = new Tools(input);

        List<String> result;
        result = new ArrayList<>();

        LexiconErrorHandler tratadorErrosLexico = new LexiconErrorHandler(result);
        SyntactictErrorHandler tratadorErrosSintatico = new SyntactictErrorHandler(result);

        tools.lexer.removeErrorListeners();
        tools.parser.removeErrorListeners();

        tools.lexer.addErrorListener(tratadorErrosLexico);
        tools.parser.addErrorListener(tratadorErrosSintatico);

        tools.parser.programa();
        return result;
    }

    public ParserRuleContext GetTree(String input) {
        Tools tools = new Tools(input);
        ParserRuleContext tree = tools.parser.programa(); 
        return tree;
    }
    
    public Symbols GetVariableList(String input){
        Tools tools = new Tools(input);
        GatherSymbolsListener gatherSymbolsListener = new GatherSymbolsListener();
        ParserRuleContext tree = tools.parser.programa(); 
        
        ParseTreeWalker walker = new ParseTreeWalker(); 
        walker.walk(gatherSymbolsListener, tree);
        
        Symbols result = new Symbols();
        result.variables = gatherSymbolsListener.variables;
        result.functions = gatherSymbolsListener.functions;
        
        return result;
    }
}

