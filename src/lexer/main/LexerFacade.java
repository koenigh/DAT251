package lexer.main;

import java.util.List;

import tokens.Token;
/**
 * The main entry point for lexical analysis of string expressions
 */
public interface LexerFacade {
/**
 * EFFECTS: Transformation of input string expr into sequence of symbols 
 */
	public List<Token> toTokenSequence(String expr);
}