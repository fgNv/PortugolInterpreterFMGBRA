/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class DeclarationTest {
    
    @Test
    public void duplicatedTokenDeclared() throws IOException{
         TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        GatherSymbolsListener listener = helper.getListener("DuplicatedToken.txt", () -> new GatherSymbolsListener());

        Assert.assertEquals(1, listener.errors.size());
    }
    
}
