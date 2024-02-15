package lexer.stateSelection;
import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.main.LexerImpl;
/**
 * Encapsulation of state selection in a chain of responsibilities
 */
public interface StateSelector {
/**
 * Depending on <c> return a new state for <scanner> 	
 */
	public LexerState selectStateFor(Character c, Lexer scanner);
}
