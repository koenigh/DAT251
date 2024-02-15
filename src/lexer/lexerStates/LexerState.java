package lexer.lexerStates;
/** 
 * Lexer state pattern
 * Each state knows the part of the lexer, whose state it is, by an attribute, 
 * It is only necessary to access the state relevant methods
 */
public abstract class LexerState {
	private LexerStateAccess myLexer;
	public LexerState(LexerStateAccess myLexer) {
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
	protected LexerStateAccess getMyLexer(){
		return this.myLexer;
	}
}
