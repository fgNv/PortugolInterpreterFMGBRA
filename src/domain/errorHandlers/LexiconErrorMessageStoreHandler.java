/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain.errorHandlers;

import java.util.BitSet;
import java.util.List;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author Felipe
 */
public class LexiconErrorMessageStoreHandler implements ANTLRErrorListener {

    private final List<String> _errors;
    
    public LexiconErrorMessageStoreHandler(List<String> errors){
        _errors = errors;
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int line, int charPositionInLine, String msg, RecognitionException re) {
        String mensagem = "Erro léxico na linha " + line + ", coluna " + charPositionInLine + ": " + msg;        
        _errors.add(mensagem);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
        
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
        
    }
    
}
