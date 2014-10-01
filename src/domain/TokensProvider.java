/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Antl4GeneratedMember.PortugolLexer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Felipe
 */
public class TokensProvider {

    private static List<String> getTokens() {
        List<String> tokens = new ArrayList<>();
        
        for (String input : PortugolLexer.tokenNames) {
            input = input.replace("'", "");
            if (!input.contains("<") && !input.contains(">") && !input.contains("+") && !input.contains("-")
                    && !input.contains("*") && !input.contains("/") && !input.contains(":") && !input.contains(";")
                    && !input.contains(".") && !input.contains(",") && !input.contains("{") && !input.contains("}")
                    && !input.contains("[") && !input.contains("]") && !input.contains("(") && !input.contains(")")
                    && !input.contains("=") && !input.contains("!") && !input.contains("%") && !input.contains("&")
                    && !input.contains("|") && !input.contains("~")) {
                tokens.add(Matcher.quoteReplacement(input));
            }
        }
        
        return tokens;
    }
    
    public static Pattern getTokensPattern(){
        List<String> tokens = getTokens();
        return Pattern.compile(String.join("|", tokens));
    }
}
