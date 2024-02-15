package lexer.lexerStates;
import tokens.NaturalNumberToken;
/**
 * Digit Processing 
 */
public class DigitState extends LexerState {
    private Integer collectedDigits;
	public DigitState(Lexer myLexer){
		super(myLexer);
		this.collectedDigits = 0;
	}
	public void scan(Character c) {
		if(Character.isDigit(c)){
			this.collectedDigits = 	this.collectedDigits * 10 + Integer.parseInt(c.toString());
			this.getMyLexer().skipCharacter();
		}else{
			this.addSymbol();
			this.endOfProcessing();
		}
	}
	public void onTermination() {
		this.addSymbol();
	}
	private void addSymbol(){
		this.getMyLexer().addToken(new NaturalNumberToken(this.collectedDigits));
	}
}
