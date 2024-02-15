package lexer.stateSelection;
import lexer.lexerStates.LexerState;
import lexer.lexerStates.LexerStateAccess;
import lexer.main.LexerImpl;
/**
 * Encapsulation of state selection in a chain of responsibilities
 */
public interface StateSelector {
/**
 * Depending on <c> return a new state for <scanner> 	
 */
	public LexerState selectStateFor(Character c, LexerStateAccess scanner);
}
