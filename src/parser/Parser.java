package parser;
/**
 * Encapsulates common functionality of all parsers
 */
import basic.TextConstants;
import exceptions.ParserException;
import operators.BinaryOperator;
import operators.OperatorTokenToOperatorAssignment;
import tokens.Token;
public abstract class Parser {
	public BinaryOperator getOperator(Token t) throws ParserException{
		OperatorTokenToOperatorAssignment optta = OperatorTokenToOperatorAssignment.getInstance();
		if(optta.isKeyPresent(t)) return optta.get(t);
		throw new ParserException(TextConstants.NOTAVALIDTOKEN);
	}
}
