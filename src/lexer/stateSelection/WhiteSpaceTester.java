package lexer.stateSelection;

import lexer.lexerStates.LexerState;
import lexer.lexerStates.LexerStateAccess;
import lexer.lexerStates.WhitespaceState;

class WhiteSpaceTester extends StateSelectionLink {
	public WhiteSpaceTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return Character.isWhitespace(c);}
	public LexerState myState(LexerStateAccess scanner) {return new WhitespaceState(scanner);}
}
