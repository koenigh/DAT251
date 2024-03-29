package facade;

import exceptions.CalculationException;
import exceptions.ParserException;
import expressions.Expression;
import lexer.main.LexerFacade;
import lexer.main.LexerImpl;
import parser.ExpressionParser;
import parser.ExpressionParserProxy;
/**
 * Facade class only contains relevant services for clients
 */
public class ApplicationServices {
/**
 * Checks Syntax of input by either returning a valid syntax tree or an exception
 */
	public Expression checkSyntax(String input) throws ParserException {
		LexerFacade l = new LexerImpl();
		ExpressionParserProxy ep = new ExpressionParserProxy();
		return ep.toExpression(l.toTokenSequence(input));
	}
/**
 * Evaluates the input expression  
 */
	public Integer evaluate(String input) throws CalculationException, ParserException {
		return this.checkSyntax(input).evaluate();
	}
}
