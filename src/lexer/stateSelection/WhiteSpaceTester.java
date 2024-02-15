package lexer.stateSelection;

import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.lexerStates.WhitespaceState;
import lexer.main.LexerImpl;

class WhiteSpaceTester extends StateSelectionLink {
	public WhiteSpaceTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return Character.isWhitespace(c);}
	public LexerState myState(Lexer scanner) {return new WhitespaceState(scanner);}
}
