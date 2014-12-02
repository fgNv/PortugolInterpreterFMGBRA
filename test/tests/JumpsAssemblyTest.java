/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class JumpsAssemblyTest {

    @Test
    public void SimpleIfTests() throws IOException {
        String inputFileName = "SimpleIf.txt";
        String expectedFileName = "SimpleIfExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName, expectedFileName, generatorListener);
        String expected = assemblyTestHelper.getExpected();
        String result = assemblyTestHelper.getResult();
        Assert.assertEquals(expected, result);
    }
        
    @Test
    public void ComposedIfTests() throws IOException {
        String inputFileName = "ComposedIf.txt";
        String expectedFileName = "ComposedIfExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName, expectedFileName, generatorListener);
        String expected = assemblyTestHelper.getExpected();
        String result = assemblyTestHelper.getResult();
        Assert.assertEquals(expected, result);
    }
}
