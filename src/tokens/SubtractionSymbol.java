package tokens;

import basic.TextConstants;
/**
 * The (one and only) --token
 */
public class SubtractionSymbol implements OperatorSymbol {
	private static SubtractionSymbol theInstance;
	private SubtractionSymbol(){
		super();
	}
	public static SubtractionSymbol getTheInstance(){
		if (theInstance==null) theInstance = new SubtractionSymbol();
		return theInstance;
	}
	public String toString(){
		return TextConstants.SUB.toString();
	}
}
