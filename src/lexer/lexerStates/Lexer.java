package lexer.lexerStates;

import java.util.List;

import tokens.Token;
/**
 * The main entry point for lexical analysis of string expressions
 */
public interface Lexer {
/**
 * EFFECTS: Transformation of input string expr into sequence of symbols 
 */
	public List<Token> toTokenSequence(String expr);
/**
 * EFFECTS: 	Deletion of first character of this.currentExpression
 * REQUIRES:	currentExpression.length>0
 */
	void skipCharacter();
/**	
 * Adds symbol to output token list 
 */
	void addToken(Token s);
/**	
 * Enables state pattern
 */
	void setState(LexerState newState);
}