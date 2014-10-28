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
public class TypeTest {

    @Test
    public void WrongTypeAttribution() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("WrongTypeAttribution.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(1, listener.errors.size());
    }
    
    @Test
    public void WrongExpressionType() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("WrongExpressionType.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(1, listener.errors.size());
    }
    
    @Test 
    public void WrongVariableInitializationType() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("WrongVariableInitializationType.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(1, listener.errors.size());        
    }
    
    @Test 
    public void ComplexBoolExpressionEvaluation() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("ComplexBoolExpression.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(0, listener.errors.size());        
    }
    
    
    @Test 
    public void MultipleLevelArithmeticExpressionEvaluation() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("CorrectMultipleLevelArithmeticExpression.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(0, listener.errors.size());        
    }
    
    @Test 
    public void CorrectStringConcatenationExpressionEvaluation() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("CorrectStringConcatenationExpression.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(0, listener.errors.size());        
    }
    
    @Test 
    public void WrongStringConcatenationExpressionEvaluation() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("WrongStringConcatenationExpression.txt", (s) -> manager.GetListener(s));
        
        Assert.assertEquals(1, listener.errors.size());        
    }
}
