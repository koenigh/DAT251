package lexer.stateSelection;

import lexer.lexerStates.DigitState;
import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.main.LexerImpl;

class DigitTester extends StateSelectionLink {
	public DigitTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return Character.isDigit(c);}
	public LexerState myState(Lexer scanner) {return new DigitState(scanner);}
}
