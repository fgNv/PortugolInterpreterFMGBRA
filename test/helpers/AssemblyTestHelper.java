package helpers;

import domain.LanguageManager;
import domain.Symbols;
import domain.listeners.GatherSymbolsListener;
import domain.listeners.IAssemblyGeneratorListener;
import java.io.IOException;

/**
 *
 * @author Felipe
 */
public class AssemblyTestHelper {
    private final String result;
    private final String expected;

    public AssemblyTestHelper(String inputPath, String expectedPath, IAssemblyGeneratorListener generatorListener) throws IOException{
        TestHelpers<GatherSymbolsListener> helper = new TestHelpers<>();
        LanguageManager manager = new LanguageManager();
        GatherSymbolsListener listener = helper.getListener(inputPath, (s) -> manager.GetListener(s));
        Symbols symbols = listener.getSymbols();
        String input = helper.getInput(inputPath);
        AssemblyGenerator generator = new AssemblyGenerator(generatorListener, symbols, input);
        result = generator.generateAssembly();
        expected = helper.getInput(expectedPath);
    }
    
    public String getResult(){
        return this.result;
    }
    
    public String getExpected(){
        return this.expected;
    }
}
