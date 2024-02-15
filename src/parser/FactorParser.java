package parser;

import java.util.List;

import basic.TextConstants;
import exceptions.ParserException;
import expressions.BracketExpression;
import expressions.Expression;
import expressions.Factor;
import expressions.NaturalNumber;
import tokens.*;
/**
 * Responsible for parsing expressions of shape "(E)" or "n\in Nat"
 */
class FactorParser extends Parser{
	public FactorParser() {
		super();
	}
	public Factor toExpression(List<Token> tokenList) throws ParserException{
		Token nextToken = tokenList.get(0);
		if(nextToken instanceof NaturalNumberToken) 
			return new NaturalNumber((NaturalNumberToken)tokenList.remove(0));
		if(nextToken instanceof BracketOpen) {
			tokenList.remove(0);
			Expression e = AbstractParserFactory.getTheFactory().createExpressionParser().toExpression(tokenList);
			if(tokenList.get(0) instanceof BracketClose) {
				tokenList.remove(0);
				return new BracketExpression(e);
			}
			else throw new ParserException("Missing closing bracket!");
		}
		throw new ParserException(TextConstants.EXPECTED + " natural number or bracket expression, "+ TextConstants.FOUND + nextToken);
	}
}
