package tokens;
import basic.TextConstants;
/**
 * The (one and only) +-token
 */
public class AdditionSymbol implements OperatorSymbol {
	private static AdditionSymbol theInstance;
	private AdditionSymbol(){
		super();
	}
	public static AdditionSymbol getTheInstance(){
		if (theInstance==null) theInstance = new AdditionSymbol();
		return theInstance;
	}	
	public String toString(){
		return TextConstants.ADD.toString();
	}
}
