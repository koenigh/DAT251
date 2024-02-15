package tokens;
import basic.TextConstants;
/**
 * The (one and only) *-token
 */
public class MultiplicationSymbol implements OperatorSymbol{
	private static MultiplicationSymbol theInstance;
	private MultiplicationSymbol(){
		super();
	}
	public static MultiplicationSymbol getTheInstance(){
		if (theInstance==null) theInstance = new MultiplicationSymbol();
		return theInstance;
	}
	public String toString(){
		return TextConstants.MULTIPLY.toString();
	}
}
