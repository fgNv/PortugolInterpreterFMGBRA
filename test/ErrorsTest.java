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
        URL url = getClass().getResource("CorrectSyntaxExampleFile.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(0, errors.size());
    }
    
    @Test
    public void incorrectLibrarySyntaxInput() throws IOException {
        LanguageManager manager = new LanguageManager();
        URL url = getClass().getResource("IncorrectLibrarySyntaxExampleFile.txt");
        String input = FileHelper.GetStringFromFile(url.getPath());
        List<String> errors;
        errors = manager.Validate(input);

        Assert.assertEquals(1, errors.size());
    }
}
