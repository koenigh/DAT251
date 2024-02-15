package lexer.lexerStates;

import lexer.stateSelection.StateSelectionGateway;
/**
 * Responsible for determining the next state
 */
public class SelectionState extends LexerState {
	private StateSelectionGateway stateSelector;
	public SelectionState(Lexer myLexer) {
		super(myLexer);
		this.stateSelector = new StateSelectionGateway(); 
	}
	public void scan(Character c) {
		Lexer s = this.getMyLexer();
		// Delegate state selection to a responsibility chain 
		s.setState(this.stateSelector.selectStateFor(c,s));  
	}
	public void onTermination() {
		return;
	}
}
