package parser;

import java.util.List;

import basic.TextConstants;
import exceptions.ParserException;
import expressions.Expression;
import expressions.Sum;
import expressions.Summand;
import operators.BinaryOperator;
import tokens.EndSymbol;
import tokens.Token;
/**
 * A proxy for an expression parser - enabling pre- and postprocessing
 */
public class ExpressionParserProxy{
	public Expression toExpression(List<Token> tokenList) throws ParserException{
		tokenList.add(new EndSymbol());
		ExpressionParser ep = AbstractParserFactory.getTheFactory().createExpressionParser();
		Expression exp = ep.toExpression(tokenList);
		if(tokenList.size() > 1) throw new ParserException(TextConstants.somethingExtraBehind + tokenList.toString());
		return exp;
	}
}
