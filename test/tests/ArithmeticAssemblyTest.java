/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import domain.LanguageManager;
import domain.Symbols;
import domain.listeners.BipAssemblyListener;
import domain.listeners.GatherSymbolsListener;
import helpers.TestHelpers;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class ArithmeticAssemblyTest {

    @Test
    public void GenerateSimpleAttribution() throws IOException {
        String inputFileName = "SimpleAttribution.txt";
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener(inputFileName, (s) -> manager.GetListener(s));
//        Symbols symbols = listener.getSymbols();
//        String input = helper.getInput(inputFileName);
        BipAssemblyListener generatorListener = new BipAssemblyListener();
//        AssemblyGenerator generator = new AssemblyGenerator(generatorListener, symbols, input);
//        String assembly = generator.generateAssembly();
//        String expected = helper.getInput("SimpleAttributionExpectedAssembly.txt");

//        Assert.assertEquals(expected, assembly);

    }
}
