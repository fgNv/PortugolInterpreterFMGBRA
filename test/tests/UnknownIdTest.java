package tests;


import domain.LanguageManager;
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
public class UnknownIdTest {

    @Test
    public void DetectUndeclaredTokens() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("UnknownId.txt", (s) -> manager.GetListener(s));

        Assert.assertEquals(3, listener.unknownUsedIds.size());
    }

    @Test
    public void DetectUndeclaredTokensDiffScopes() throws IOException {
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener("UnknownIdDiffScopes.txt", (s) -> manager.GetListener(s));

        Assert.assertEquals(1, listener.unknownUsedIds.size());
        Assert.assertEquals(3, listener.errors.size());

    }
}
