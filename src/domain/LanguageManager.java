package domain;

import domain.errorHandlers.LexiconErrorMessageStoreHandler;
import domain.errorHandlers.SyntactictErrorMessageStoreHandler;
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

    private void arrangeErrorListeners(Tools tools, List<String> errors) {

        LexiconErrorMessageStoreHandler tratadorErrosLexico = new LexiconErrorMessageStoreHandler(errors);
        SyntactictErrorMessageStoreHandler tratadorErrosSintatico = new SyntactictErrorMessageStoreHandler(errors);

        tools.lexer.removeErrorListeners();
        tools.parser.removeErrorListeners();

        tools.lexer.addErrorListener(tratadorErrosLexico);
        tools.parser.addErrorListener(tratadorErrosSintatico);
    }

    public ParserRuleContext GetTree(String input) {
        Tools tools = new Tools(input);
        ParserRuleContext tree = tools.parser.programa();
        return tree;
    }

    public Symbols GetVariableList(String input) {

        GatherSymbolsListener gatherSymbolsListener = new GatherSymbolsListener();
        Tools tools = new Tools(input);
        arrangeErrorListeners(tools, gatherSymbolsListener.errors);
        ParserRuleContext tree = tools.parser.programa();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(gatherSymbolsListener, tree);

        Symbols result = new Symbols(gatherSymbolsListener.variables, gatherSymbolsListener.functions, gatherSymbolsListener.parameters, gatherSymbolsListener.errors);
        return result;
    }
}
