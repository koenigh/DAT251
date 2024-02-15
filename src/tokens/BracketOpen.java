package tokens;
import basic.TextConstants;
/**
 * The (one and only) )-token
 */
public class BracketOpen implements Token {
	private static BracketOpen theInstance = new BracketOpen();
	private BracketOpen(){
		super();
	}
	public static BracketOpen getTheInstance(){
		return theInstance;
	}
	public String toString(){
		return TextConstants.BRACKETOPEN.toString();
	}
}
