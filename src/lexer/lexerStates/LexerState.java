package lexer.lexerStates;
/** 
 * Lexer state pattern
 * Each state knows the lexer, whose state it is, by an attribute, i.e. a permanent reference
 */
public abstract class LexerState {
	private Lexer myLexer;
	public LexerState(Lexer myLexer) {
		super();
		this.myLexer = myLexer;
	}

/**
 * May add symbol to current Scanner result depending on <c>, 
 * May erase <c> in input string 
 * May change state    
 */
	public abstract void scan(Character c);
/**
 * Final actions if the input string has completely been traversed
 */
	public abstract void onTermination();
	
// =================================================================
// ================ Auxiliary operations for subclasses ============
// =================================================================	
	protected void endOfProcessing(){
		this.getMyLexer().setState(new SelectionState(this.getMyLexer()));
	}
	protected Lexer getMyLexer(){
		return this.myLexer;
	}
}
