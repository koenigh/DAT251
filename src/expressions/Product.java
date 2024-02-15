package expressions;

import exceptions.CalculationException;
import operators.BinaryOperator;
/**
 * A term of type F*S or F/S
 */
public abstract class Product implements Summand, BinaryTerm {
	private BinaryOperator op;
	public Product(BinaryOperator op) {
		super();
		this.op = op;
	}
	public Integer evaluate() throws CalculationException{
		return this.op.calculate(this.getArg1().evaluate(), this.getArg2().evaluate());
	}
	public void accept(ExpressionVisitor ev) {
		ev.handle(this);
	}	
	public <T> T accept(ExpressionVisitorGen<T> ev) {
		return ev.handle(this);
	}	
	
	public BinaryOperator getOp() {
		return op;
	}
}
