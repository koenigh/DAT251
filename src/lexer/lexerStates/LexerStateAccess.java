package lexer.lexerStates;

import tokens.Token;
/**
 * The main entry point for lexical analysis of string expressions
 */
public interface LexerStateAccess {
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