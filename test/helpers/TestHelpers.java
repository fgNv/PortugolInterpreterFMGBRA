package helpers;

import Antl4GeneratedMember.PortugolBaseListener;
import domain.LanguageManager;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 * @param <T>
 */
public class TestHelpers<T extends PortugolBaseListener> {

    public interface PortugolBaseListenerConstuct<T extends PortugolBaseListener> {

        public T construct();
    }

    public T getListener(String inputUrl, PortugolBaseListenerConstuct<T> constructor) throws IOException {
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource(inputUrl);
        String input = FileHelper.GetStringFromFile(url.getPath());
        ParserRuleContext tree = manager.GetTree(input);

        ParseTreeWalker walker = new ParseTreeWalker();
        T listener = constructor.construct();

        walker.walk(listener, tree);
        return listener;
    }
}
