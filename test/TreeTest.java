
import domain.listeners.GatherFunctionNamesListener;
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
        TestHelpers<GatherFunctionNamesListener> helper = new TestHelpers<>();
        GatherFunctionNamesListener listener = helper.getListener("CorrectSyntax.txt", () -> new GatherFunctionNamesListener());
        Assert.assertEquals(1, listener.functions.size());
    }

    @Test
    public void GetSymbols() throws IOException {        
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("CorrectSyntax.txt", () -> new GatherSymbolsListener());
        
        Assert.assertEquals(1, listener.functions.size());
        Assert.assertEquals(2, listener.variables.size());
        Assert.assertEquals(1, listener.vectors.size());
    }
}
