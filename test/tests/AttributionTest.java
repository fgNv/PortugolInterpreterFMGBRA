/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import domain.listeners.GatherSymbolsListener;
import helpers.TestHelpers;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class AttributionTest {

    @Test
    public void attributionToFunction() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("AttributionToFunction.txt", () -> new GatherSymbolsListener());
        
        Assert.assertEquals(1, listener.errors.size()); 
    }
}
