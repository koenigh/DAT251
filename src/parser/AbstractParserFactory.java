package parser;
/**
 * Abstract factory for toggling between evaluation modes
 */
public abstract class AbstractParserFactory {
	private static AbstractParserFactory theFactory; 
	static {setRTLMode();}
	public static void setRTLMode() {theFactory = new ParserFactoryRTL();}
	public static void setLTRMode() {theFactory = new ParserFactoryLTR();}
	public static AbstractParserFactory getTheFactory() {return theFactory;}
	public abstract ExpressionParser createExpressionParser();
	public abstract SummandParser createSummandParser();
/**
 * Returns true, if eval. is from left to right, false otherwise
 */
	public abstract boolean isLTR();    
}
