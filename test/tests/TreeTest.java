package tests;


import domain.LanguageManager;
import helpers.TestHelpers;
import domain.listeners.GatherSymbolsListener;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class TreeTest {

    @Test
    public void GetFunctions() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("CorrectSyntax.txt", (s) -> manager.GetListener(s));
        Assert.assertEquals(3, listener.functions.size());
    }

    @Test
    public void GetSymbols() throws IOException {        
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("CorrectSyntax.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(3, listener.functions.size());
        Assert.assertEquals(3, listener.variables.size());
    }
}
