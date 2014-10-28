package tests;

import domain.LanguageManager;
import domain.listeners.GatherSymbolsListener;
import helpers.TestHelpers;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class ErrorsTest {

    @Test
    public void correctSyntaxInput() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("CorrectSyntax.txt", (s) -> manager.GetListener(s));

        Assert.assertEquals(0, listener.errors.size());
    }

    @Test
    public void correctLibrarySyntaxInput() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("CorrectLibrarySyntax.txt", (s) -> manager.GetListener(s));
      
        Assert.assertEquals(0, listener.errors.size());
    }

    @Test
    public void incorrectLibrarySyntaxInput() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("IncorrectLibrarySyntax.txt", (s) -> manager.GetListener(s));
        Assert.assertEquals(1, listener.errors.size());
    }

    @Test
    public void unfinishedExpression() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("UnfinishedExpression.txt", (s) -> manager.GetListener(s));

        Assert.assertEquals(1, listener.errors.size());
    }
}
