package lexer.stateSelection;

import lexer.lexerStates.ErrorState;
import lexer.lexerStates.LexerState;
import lexer.lexerStates.LexerStateAccess;
/**
 * Chain Ending!
 */
class StateSelectionEnding implements StateSelector {
	public LexerState selectStateFor(Character c, LexerStateAccess lexer) {
		return new ErrorState(lexer);
	}
}
