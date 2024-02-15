package parser;
/**
 * A factory for left to right structures and evaluation
 */
public class ParserFactoryLTR extends AbstractParserFactory {
	public ExpressionParser createExpressionParser() {
		return new ExpressionParserLTR();
	}
	public SummandParser createSummandParser() {
		return new SummandParserLTR();
	}
	public boolean isLTR() {
		return true;
	}
}
