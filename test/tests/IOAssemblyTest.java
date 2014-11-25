package tests;

import domain.listeners.BipAssemblyListener;
import domain.listeners.IAssemblyGeneratorListener;
import helpers.AssemblyTestHelper;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class IOAssemblyTest {

    @Test
    public void SimpleLeia() throws IOException {
        String inputFileName = "SimpleLeia.txt";
        String expectedFileName = "SimpleLeiaExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName, expectedFileName, generatorListener);
        String expected = assemblyTestHelper.getExpected().trim();
        String result = assemblyTestHelper.getResult().trim();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void SimpleEscreva() throws IOException {
        String inputFileName = "SimpleEscreva.txt";
        String expectedFileName = "SimpleEscrevaExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName, expectedFileName, generatorListener);
        String expected = assemblyTestHelper.getExpected().trim();
        String result = assemblyTestHelper.getResult().trim();
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void ExpressionSumEscreva() throws IOException {
        String inputFileName = "ExpressionSumEscreva.txt";
        String expectedFileName = "ExpressionSumEscrevaExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName, expectedFileName, generatorListener);
        String expected = assemblyTestHelper.getExpected().trim();
        String result = assemblyTestHelper.getResult().trim();
        Assert.assertEquals(expected, result);
    }
}
