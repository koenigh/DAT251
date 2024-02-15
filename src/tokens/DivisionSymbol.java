package tokens;

import basic.TextConstants;
/**
 * The (one and only) /-token
 */
public class DivisionSymbol implements OperatorSymbol{
	private static DivisionSymbol theInstance;
	private DivisionSymbol(){
		super();
	}
	public static DivisionSymbol getTheInstance(){
		if (theInstance==null) theInstance = new DivisionSymbol();
		return theInstance;
	}
	public String toString(){
		return TextConstants.DIV.toString();
	}
}
