package parser;

import java.util.List;

import basic.TextConstants;
import exceptions.ParserException;
import expressions.Factor;
import expressions.Product;
import expressions.Summand;
import operators.BinaryOperator;
import tokens.AdditionSymbol;
import tokens.BracketClose;
import tokens.DivisionSymbol;
import tokens.EndSymbol;
import tokens.MultiplicationSymbol;
import tokens.SubtractionSymbol;
import tokens.Token;
/**
 * Responsible for parsing structures of variable S of the syntax rules 
 * The common interface of parsers of different summand parse tree construction
 */
abstract class SummandParser extends Parser{
/**	
 * @param tokenList
 * @returns parseTree from tokenList
 * @throws ParserException on syntax error 
 */
	public Summand toExpression(List<Token> tokenList) throws ParserException{
		Factor first = new FactorParser().toExpression(tokenList);
		Token nextToken = tokenList.get(0);
		if(nextToken instanceof MultiplicationSymbol | nextToken instanceof DivisionSymbol) {
			tokenList.remove(0);
			return this.createProduct(first, this.getOperator(nextToken), AbstractParserFactory.getTheFactory().createSummandParser().toExpression(tokenList));
		}		
		return first;
	}	
/**
 * @param firstFactor
 * @param rest
 * @returns a product or quotient consisting of firstFactor and rest (either one factor or the remaining product / quotient)  
 */
	public abstract Product createProduct(Factor firstFactor, BinaryOperator op, Summand rest);
}