
import domain.listeners.GatherSymbolsListener;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 */
public class TypeTest {

    @Test
    public void WrongTypeAttribution() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongTypeAttribution.txt", () -> new GatherSymbolsListener());
        
        Assert.assertEquals(1, listener.errors.size());
    }
    
    @Test
    public void WrongExpressionType() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongExpressionType.txt", () -> new GatherSymbolsListener());
        
        Assert.assertEquals(1, listener.errors.size());
    }
    
    @Test 
    public void WrongVariableInitializationType() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongVariableInitializationType.txt", () -> new GatherSymbolsListener());
        
        Assert.assertEquals(1, listener.errors.size());        
    }
    
    @Test 
    public void ComplexBoolExpressionEvaluation() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("ComplexBoolExpression.txt", () -> new GatherSymbolsListener());
        
        Assert.assertEquals(0, listener.errors.size());        
    }
}
