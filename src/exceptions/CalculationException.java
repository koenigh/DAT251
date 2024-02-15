package exceptions;
/**
 * E.g. division by zero
 */
public class CalculationException extends Exception {
	private static final long serialVersionUID = 1L;
	public CalculationException(String msg){
		super(msg);
	}
}
