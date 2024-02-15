package facade;

import exceptions.CalculationException;
import exceptions.ParserException;
import expressions.Expression;
import lexer.lexerStates.Lexer;
import lexer.main.LexerImpl;
import parser.ExpressionParser;
import parser.ExpressionParserProxy;
/**
 * Facade class only contains relevant services for clients
 */
public class ApplicationFacade {
	public Expression checkSyntax(String input) throws ParserException {
		Lexer l = new LexerImpl();
		ExpressionParserProxy ep = new ExpressionParserProxy();
		return ep.toExpression(l.toTokenSequence(input));
	}
	public Integer evaluate(String input) throws CalculationException, ParserException {
		return this.checkSyntax(input).evaluate();
	}
}
