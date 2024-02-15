package lexer.lexerStates;

import basic.TextConstants;
import tokens.BracketClose;
import tokens.BracketOpen;
/**
 * Processing brackets: A bracket is always a single character
 */
public class BracketState extends LexerState {
	public BracketState(LexerStateAccess myLexer) {
		super(myLexer);
	}
	public void scan(Character c) {
		LexerStateAccess s = this.getMyLexer();
		if(c.equals(TextConstants.BRACKETOPEN)) 	s.addToken(BracketOpen.getTheInstance());
		if(c.equals(TextConstants.BRACKETCLOSE)) 	s.addToken(BracketClose.getTheInstance());
		s.skipCharacter();
		this.endOfProcessing();
	}
	public void onTermination() {
		return;
	}
}
