package expressions;
import operators.BinaryOperator;
/**
 * A sum is a term of the form a + b or a - b
 */
public class SumLTR extends Sum{
	private Expression arg1;
	private Summand arg2;
	private BinaryOperator op;
	public SumLTR(Expression arg1, Summand arg2, BinaryOperator op) {
		super(op);
		this.arg1 = arg1;
		this.arg2 = arg2;
	}	
	public Expression getArg1() {
		return arg1;
	}
	public Summand getArg2() {
		return arg2;
	}
}
