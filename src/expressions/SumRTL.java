package expressions;
import operators.BinaryOperator;
/**
 * A sum is a term of the form a + b or a - b
 */
public class SumRTL extends Sum{
	private Summand arg1;
	private Expression arg2;
	private BinaryOperator op;
	public SumRTL(Summand arg1, Expression arg2, BinaryOperator op) {
		super(op);
		this.arg1 = arg1;
		this.arg2 = arg2;
	}	
	public Summand getArg1() {
		return arg1;
	}
	public Expression getArg2() {
		return arg2;
	}
}
