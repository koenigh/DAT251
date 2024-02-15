package lexer.stateSelection;
import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.main.LexerImpl;

public class StateSelectionGateway implements StateSelector{
	private StateSelectionLink first;
	public StateSelectionGateway() {
/**
 * Creation of chain - can be varied here!		
 */
		this.first = new WhiteSpaceTester(new DigitTester(new BracketTester(new OperatorTester(new StateSelectionEnding()))));
	}
	public LexerState selectStateFor(Character c, Lexer scanner) {
		return this.first.selectStateFor(c, scanner);
	}
}
