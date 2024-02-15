package tokens;

import basic.TextConstants;
/**
 * Artificial End Symbol to prevent the parsers from loosing track
 */
public class EndSymbol implements Token {
	public String toString(){
		return TextConstants.ENDOFEXPRESSION;
	}
}
