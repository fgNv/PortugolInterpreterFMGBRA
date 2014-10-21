
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
public class FunctionCallTest {
    
    @Test
    public void wrongParameter() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongFunctionCallParameter.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(1, listener.errors.size());
        
    }
}
