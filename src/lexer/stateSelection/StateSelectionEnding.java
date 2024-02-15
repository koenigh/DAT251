package lexer.stateSelection;

import lexer.lexerStates.ErrorState;
import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.main.LexerImpl;
/**
 * Chain Ending!
 */
class StateSelectionEnding implements StateSelector {
	public LexerState selectStateFor(Character c, Lexer scanner) {
		return new ErrorState(scanner);
	}
}
