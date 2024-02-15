package lexer.lexerStates;
import tokens.SymbolTable;
/**
 * Processing Operators
 */
public class OperatorState extends LexerState { 
	public OperatorState(Lexer myLexer) {
		super(myLexer);
	}
	public void scan(Character c) {
		this.getMyLexer().skipCharacter();
		this.addSymbol(c);
		this.endOfProcessing();
	}
	public void onTermination() {
		return;
	}	
	private void addSymbol(Character c){
		this.getMyLexer().addToken(SymbolTable.getInstance().get(c));
	}
}
