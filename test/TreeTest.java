import domain.LanguageManager;
import domain.listeners.GatherFunctionNamesListener;
import domain.listeners.GatherSymbolsListener;
import helpers.FileHelper;
import java.io.IOException;
import java.net.URL;
import junit.framework.Assert;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class TreeTest {

    @Test
    public void GetFunctions() throws IOException {
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("CorrectSyntaxExampleFile.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        ParserRuleContext tree = manager.GetTree(input);
        
        ParseTreeWalker walker = new ParseTreeWalker(); 
        GatherFunctionNamesListener listener = new GatherFunctionNamesListener();
        
        walker.walk(listener, tree);
        
        Assert.assertEquals(1, listener.functions.size());
    }
    
    @Test
    public void GetSymbols() throws IOException{
        
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("CorrectSyntaxExampleFile.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        ParserRuleContext tree = manager.GetTree(input);
        
        ParseTreeWalker walker = new ParseTreeWalker(); 
        GatherSymbolsListener listener = new GatherSymbolsListener();
        
        walker.walk(listener, tree);
        
        Assert.assertEquals(1, listener.functions.size());
        Assert.assertEquals(3, listener.variables.size());
    }
}
