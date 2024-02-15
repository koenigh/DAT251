package expressions;

import operators.BinaryOperator;
/**
 * A term of type F*S or F/S
 */
public class ProductLTR extends Product {
	private Summand arg1;
	private Factor arg2;
	public ProductLTR(Summand arg1, Factor arg2, BinaryOperator op) {
		super(op);
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	public Summand getArg1() {
		return arg1;
	}
	public Factor getArg2() {
		return arg2;
	}
}
