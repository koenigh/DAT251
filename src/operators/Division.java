package operators;
import basic.TextConstants;
import exceptions.CalculationException;
public class Division extends BinaryOperator {
	private static Division theInstance = new Division();
	private Division(){}
	public static Division getTheInstance(){
		return theInstance;
	}
	public Integer calculate(Integer arg1, Integer arg2) throws CalculationException{
		if(arg2.equals(Integer.valueOf(0))) throw new CalculationException("Division by zero");
		return arg1 / arg2;
	}
	public String toString() {
		return ""+TextConstants.DIV;
	}
}
