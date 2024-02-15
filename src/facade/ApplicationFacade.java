package facade;

import exceptions.CalculationException;
import exceptions.ParserException;
import expressions.Expression;
import lexer.lexerStates.Lexer;
import lexer.main.LexerImpl;
import parser.ExpressionParser;
import parser.ExpressionParserProxy;
/**
 * Fassaden-Klasse in die Applikation
 * Enthält nur die für Verwenderprogramme relevanten (veröffentlichten) Operationen
 */
public class ApplicationFacade {
/**	 
 * @param input: Der arithmetische Ausdruck als Zeichenkette, z.B. "6*(10+9)"
 * @return Der Syntaxbaum für den eingegebenen Ausdruck, wenn die Syntax korrekt war
 * @throws ParserException, wenn die Syntax nicht korrekt war, z.B. "6*(10+9"
 */
	public Expression checkSyntax(String input) throws ParserException {
		Lexer l = new LexerImpl();
		ExpressionParserProxy ep = new ExpressionParserProxy();
		return ep.toExpression(l.toTokenSequence(input));
	}
/**	
 * @param input: Der arithmetische Ausdruck als Zeichenkette, z.B. "6*(10+9)"
 * @return Den Wert der Eingabe, z.B. 114 (für obigen input) 
 * @throws CalculationException, falls durch Null dividiert wurde
 * @throws ParserException, wenn die Syntax nicht korrekt war, z.B. "6*(10+9"
 */
	public Integer evaluate(String input) throws CalculationException, ParserException {
		return this.checkSyntax(input).evaluate();
	}
}
