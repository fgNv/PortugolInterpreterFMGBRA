package helpers;

import Antl4GeneratedMember.PortugolBaseListener;
import domain.LanguageManager;
import java.io.IOException;
import java.net.URL;
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

        public T construct(String input);
    }

    public T getListener(String inputUrl, PortugolBaseListenerConstuct<T> constructor) throws IOException {
        String input = getInput(inputUrl);
        T listener = constructor.construct(input);

        return listener;
    }
    
    public String getInput(String inputUrl) throws IOException{
        URL url = getClass().getResource(inputUrl);
        String input = FileHelper.GetStringFromFile(url.getPath());
        return input;
    }
}
