package lexer.stateSelection;

import lexer.lexerStates.LexerState;
import lexer.lexerStates.LexerStateAccess;
import lexer.lexerStates.OperatorState;
import lexer.main.LexerImpl;
import tokens.TokenTable;

class OperatorTester extends StateSelectionLink {
	public OperatorTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return TokenTable.getInstance().exists(c);}
	public LexerState myState(LexerStateAccess lexer) 	{return new OperatorState(lexer);}
}
