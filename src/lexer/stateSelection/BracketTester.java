package lexer.stateSelection;

import basic.TextConstants;
import lexer.lexerStates.BracketState;
import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.main.LexerImpl;

class BracketTester extends StateSelectionLink {
	public BracketTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return TextConstants.isBracket(c);}
	public LexerState myState(Lexer lexer) {return new BracketState(lexer);}
}

