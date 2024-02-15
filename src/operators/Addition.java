package operators;

import basic.TextConstants;
/**
 * The one and only addition operator as a singleton
 */
public class Addition extends BinaryOperator {
	private static Addition theInstance = new Addition();
	private Addition(){}
	public static Addition getTheInstance(){
		return theInstance;
	}
	public Integer calculate(Integer arg1, Integer arg2){
		return arg1 + arg2;
	}
	public String toString() {
		return ""+TextConstants.ADD;
	}
}
