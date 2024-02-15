package expressions;

import exceptions.CalculationException;
import operators.BinaryOperator;

public abstract class Sum implements BinaryTerm, Expression{
	private BinaryOperator op;
	public Sum(BinaryOperator op) {
		super();
		this.op = op;
	}	
	public BinaryOperator getOp() {
		return op;
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
}
