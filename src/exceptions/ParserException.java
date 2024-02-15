package exceptions;
/**
 * Syntax error in an arithmetic expression
 */
public class ParserException extends Exception {
	private static final long serialVersionUID = 1L;
	public ParserException(String text){
		super(text);
	}
}
