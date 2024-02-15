package operators;

import basic.TextConstants;

/**
 * The one and only subtraction operator as a singleton
 */
public class Subtraction extends BinaryOperator {
	private static Subtraction theInstance = new Subtraction();
	private Subtraction(){}
	public static Subtraction getTheInstance(){
		return theInstance;
	}
	public Integer calculate(Integer arg1, Integer arg2){
		return arg1 - arg2;
	}
	public String toString() {
		return ""+TextConstants.SUB;
	}

}
