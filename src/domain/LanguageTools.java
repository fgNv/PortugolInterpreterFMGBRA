/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Antl4GeneratedMember.PortugolLexer;
import Antl4GeneratedMember.PortugolParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Felipe
 */
public class LanguageTools {

    public PortugolLexer lexer;
    public PortugolParser parser;

    public LanguageTools(String input) {
        ANTLRInputStream ais = new ANTLRInputStream(input);
        lexer = new PortugolLexer(ais);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        parser = new PortugolParser(stream);
    }
}
