/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DeclarationTest {

    @Test
    public void duplicatedTokenDeclared() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("DuplicatedToken.txt", (s) -> manager.GetListener(s));

        Assert.assertEquals(1, listener.errors.size());
    }

    @Test
    public void incompleteVectorDeclaration() throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("IncompleteVectorDeclaration.txt", (s) -> manager.GetListener(s));

        Assert.assertEquals(2, listener.errors.size());        
    }

}
