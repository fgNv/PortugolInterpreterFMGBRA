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
public class ArithmeticAssemblyTest {

    @Test
    public void GenerateSimpleAttribution() throws IOException {        
        String inputFileName = "SimpleAttribution.txt";
        String expectedFileName = "SimpleAttributionExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName,expectedFileName, generatorListener);        
        Assert.assertEquals(assemblyTestHelper.getExpected(), assemblyTestHelper.getResult());
    }
    
    @Test
    public void GenerateSimpleSum() throws IOException {        
        String inputFileName = "SimpleSum.txt";
        String expectedFileName = "SimpleSumExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName,expectedFileName, generatorListener);        
        String expected = assemblyTestHelper.getExpected();
        String result = assemblyTestHelper.getResult();
        Assert.assertEquals(expected, result);
    } 
    
    @Test
    public void GenerateTwoSums() throws IOException {        
        String inputFileName = "TwoSums.txt";
        String expectedFileName = "TwoSumsExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName,expectedFileName, generatorListener);        
        String expected = assemblyTestHelper.getExpected();
        String result = assemblyTestHelper.getResult();
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void InitializeVariable() throws IOException {        
        String inputFileName = "InitializeVariableAssembly.txt";
        String expectedFileName = "InitializeVariableAssemblyExpectedAssembly.txt";
        IAssemblyGeneratorListener generatorListener = new BipAssemblyListener();
        AssemblyTestHelper assemblyTestHelper = new AssemblyTestHelper(inputFileName,expectedFileName, generatorListener);        
        String expected = assemblyTestHelper.getExpected();
        String result = assemblyTestHelper.getResult();
        Assert.assertEquals(expected, result);
    }
}
