import domain.LanguageManager;
import helpers.FileHelper;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class ErrorsTest {    
    @Test
    public void correctSyntaxInput() throws IOException {        
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("CorrectSyntax.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(0, errors.size());
    }
    
    @Test
    public void correctLibrarySyntaxInput() throws IOException {        
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("CorrectLibrarySyntax.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(0, errors.size());
    }
    
    @Test
    public void incorrectLibrarySyntaxInput() throws IOException {
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("IncorrectLibrarySyntax.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(1, errors.size());
    }
    
    
    @Test
    public void unfinishedExpression() throws IOException {
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("UnfinishedExpression.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(1, errors.size());
    }
    
    
    @Test
    public void correctParameterlessFunctionCall() throws IOException {        
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("ParameterlessFunctionCall.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(0, errors.size());
    }
}
