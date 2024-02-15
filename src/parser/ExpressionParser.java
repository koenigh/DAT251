package parser;

import java.util.List;

import basic.TextConstants;
import exceptions.ParserException;
import expressions.Expression;
import expressions.Sum;
import expressions.Summand;
import operators.BinaryOperator;
import tokens.AdditionSymbol;
import tokens.BracketClose;
import tokens.EndSymbol;
import tokens.SubtractionSymbol;
import tokens.Token;
/**
 * Responsible for parsing structures of syntax rules E --> ...
 * The common interface of parsers of different expression parse tree construction
 * 
 * Exception Strategy: If a parser has successfully handled his terminal symbols, then no error shall be shown
 * E.g. the present parser only checks existence of correct operator (or none)!  
 */
public abstract class ExpressionParser extends Parser{
/**
 * @param firstSummand
 * @param rest
 * @returns a sum or difference consisting of firstSummand and rest (which is either one summand or the remaining sum / difference)  
 */
	public abstract Sum createSum(Summand firstSummand, BinaryOperator op, Expression rest);
/**	
 * @param tokenList
 * @returns parseTree from input tokenList 
 * @throws ParserException, if syntax was not correct
 */
	public Expression toExpression(List<Token> tokenList) throws ParserException{
		Summand first = AbstractParserFactory.getTheFactory().createSummandParser().toExpression(tokenList);
		Token nextToken = tokenList.get(0);
		if(nextToken instanceof AdditionSymbol | nextToken instanceof SubtractionSymbol) {
			tokenList.remove(0);
			return this.createSum(first, this.getOperator(nextToken), AbstractParserFactory.getTheFactory().createExpressionParser().toExpression(tokenList));
		}
		return first;
	}
}
