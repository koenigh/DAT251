package operators;

import java.util.HashMap;
import java.util.Map;

import tokens.AdditionSymbol;
import tokens.DivisionSymbol;
import tokens.MultiplicationSymbol;
import tokens.SubtractionSymbol;
import tokens.Token;

/**
 * Assignment of operator token to operative operator
 */
public class OperatorTokenToOperatorAssignment {
	private static OperatorTokenToOperatorAssignment theInstance = new OperatorTokenToOperatorAssignment();
	private Map<Token, BinaryOperator> assignment;
	private OperatorTokenToOperatorAssignment() {
		this.assignment = new HashMap<>();
		this.fillAssignment();
	}
	public static OperatorTokenToOperatorAssignment getInstance() {return theInstance;}
	private void fillAssignment() {
		this.assignment.put(AdditionSymbol.getTheInstance(), Addition.getTheInstance());
		this.assignment.put(SubtractionSymbol.getTheInstance(), Subtraction.getTheInstance());
		this.assignment.put(MultiplicationSymbol.getTheInstance(), Multiplication.getTheInstance());
		this.assignment.put(DivisionSymbol.getTheInstance(), Division.getTheInstance());
	}
	public boolean isKeyPresent(Token t) {
		return this.assignment.containsKey(t);
	}
	public BinaryOperator get(Token t) {
		return this.assignment.get(t);
	}
}
