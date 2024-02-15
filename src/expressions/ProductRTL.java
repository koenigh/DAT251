package expressions;

import operators.BinaryOperator;
/**
 * A term of type F*S or F/S
 */
public class ProductRTL extends Product {
	private Factor arg1;
	private Summand arg2;
	public ProductRTL(Factor arg1, Summand arg2, BinaryOperator op) {
		super(op);
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	public Factor getArg1() {
		return arg1;
	}
	public Summand getArg2() {
		return arg2;
	}
}
