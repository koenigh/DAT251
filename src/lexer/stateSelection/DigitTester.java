package lexer.stateSelection;

import lexer.lexerStates.DigitState;
import lexer.lexerStates.LexerState;
import lexer.lexerStates.LexerStateAccess;
import lexer.main.LexerImpl;

class DigitTester extends StateSelectionLink {
	public DigitTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return Character.isDigit(c);}
	public LexerState myState(LexerStateAccess lexer) {return new DigitState(lexer);}
}
