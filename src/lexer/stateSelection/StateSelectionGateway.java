package lexer.stateSelection;
import lexer.lexerStates.LexerState;
import lexer.lexerStates.LexerStateAccess;

public class StateSelectionGateway implements StateSelector{
	private StateSelectionLink first;
	public StateSelectionGateway() {
/**
 * Creation of chain - can be varied here!		
 */
		this.first = new WhiteSpaceTester(new DigitTester(new BracketTester(new OperatorTester(new StateSelectionEnding()))));
	}
	public LexerState selectStateFor(Character c, LexerStateAccess lexer) {
		return this.first.selectStateFor(c, lexer);
	}
}
