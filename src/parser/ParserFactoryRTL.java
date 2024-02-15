package parser;
/**
 * A factory for right to left structures and evaluation
 */
public class ParserFactoryRTL extends AbstractParserFactory {
	public ExpressionParser createExpressionParser() {
		return new ExpressionParserRTL();
	}
	public SummandParser createSummandParser() {
		return new SummandParserRTL();
	}
	public boolean isLTR() {
		return false;
	}
}
