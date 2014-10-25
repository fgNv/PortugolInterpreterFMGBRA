package tests;

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
        GatherSymbolsListener listener = helper.getListener("CorrectSyntax.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(0, listener.errors.size());
    }

    @Test
    public void correctLibrarySyntaxInput() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("CorrectLibrarySyntax.txt", () -> new GatherSymbolsListener());
      
        Assert.assertEquals(0, listener.errors.size());
    }

    @Test
    public void incorrectLibrarySyntaxInput() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("IncorrectLibrarySyntax.txt", () -> new GatherSymbolsListener());      

        Assert.assertEquals(1, listener.errors.size());
    }

    @Test
    public void unfinishedExpression() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("UnfinishedExpression.txt", () -> new GatherSymbolsListener());      

        Assert.assertEquals(1, listener.errors.size());
    }
}
