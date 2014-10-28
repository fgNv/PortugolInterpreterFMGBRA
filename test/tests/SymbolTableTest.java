package tests;


import helpers.TestHelpers;
import domain.Function;
import domain.LanguageManager;
import domain.Variable;
import domain.listeners.GatherSymbolsListener;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class SymbolTableTest {
    
    @Test
    public void GetVariablesTypesAndScopes() throws IOException{
        
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("ThirdLevelScope.txt", (s) -> manager.GetListener(s));
                
        Variable test = listener.variables.get(0);
        Assert.assertEquals("inteiro", test.getType());
        Assert.assertEquals(0, test.getScope());
        test = listener.variables.get(1);
        Assert.assertEquals("real", test.getType());
        Assert.assertEquals(1, test.getScope());
        test = listener.variables.get(2);
        Assert.assertEquals("cadeia", test.getType());
        Assert.assertEquals(2, test.getScope());
        test = listener.variables.get(3);
        Assert.assertEquals("caracter", test.getType());
        Assert.assertEquals(3, test.getScope());
        test = listener.variables.get(4);
        Assert.assertEquals("inteiro", test.getType());
        Assert.assertEquals(5, test.getScope());        
        test = listener.parameters.get(0);
        Assert.assertEquals("cadeia", test.getType());
        Assert.assertEquals(5, test.getScope());
        
        Function ftest = listener.functions.get(0);
        Assert.assertEquals("vazio", ftest.getType());
        ftest = listener.functions.get(1);
        Assert.assertEquals("inteiro", ftest.getType());
    }
    
}
