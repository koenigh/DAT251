package lexer.stateSelection;

import lexer.lexerStates.Lexer;
import lexer.lexerStates.LexerState;
import lexer.lexerStates.OperatorState;
import lexer.main.LexerImpl;
import tokens.SymbolTable;

class OperatorTester extends StateSelectionLink {
	public OperatorTester(StateSelector successor) {
		super(successor);
	}
	public boolean myCondition(Character c) {return SymbolTable.getInstance().exists(c);}
	public LexerState myState(Lexer scanner) 	{return new OperatorState(scanner);}
}
