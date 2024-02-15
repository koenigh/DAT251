package operators;

import exceptions.CalculationException;
import tokens.OperatorSymbol;
/**
 * Any binary operator (like +, -, *, /, etc)
 */
public abstract class BinaryOperator{
	public BinaryOperator(){}
/**
 * Returns the evaluation of <this>(arg1, arg2)
 */
	public abstract Integer calculate(Integer arg1, Integer arg2) throws CalculationException;
}
