package lexer.lexerStates;
/**
 * Processing Whitespace
 */
public class WhitespaceState extends LexerState{
	public WhitespaceState(LexerStateAccess myLexer) {
		super(myLexer);
	}
	public void scan(Character c) {
		this.getMyLexer().skipCharacter();
		this.getMyLexer().setState(new SelectionState(this.getMyLexer()));
	}
	public void onTermination() {
		return;
	}
}
