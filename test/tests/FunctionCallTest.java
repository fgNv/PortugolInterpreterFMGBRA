package tests;


import helpers.TestHelpers;
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
    public void wrongParameterType() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongFunctionCallParameter.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(1, listener.errors.size());        
    }
    
    @Test
    public void wrongParameterTypeLongList() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongFunctionCallParameterTypeLongList.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(2, listener.errors.size());        
    }
    
    @Test
    public void wrongParameterQuantity() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("WrongFunctionCallParameterQuantity.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(1, listener.errors.size());        
    }
    
    @Test
    public void correctParameterlessFunctionCall() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("ParameterlessFunctionCall.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(0, listener.errors.size());        
    }
}
