package expressions;

import exceptions.CalculationException;

/**
 * The general interface which represents all arithmetic expressions
 */
public interface Expression {
/**	
 * Evaluates this objects
 */
	public Integer evaluate() throws CalculationException;
/**
 * Makes objects visitable with a simple visitor
 */
	public void accept(ExpressionVisitor ev) ;
/**
 * Makes objects visitable with a visitor which carries a generic type
 */
	public <T> T accept(ExpressionVisitorGen<T> ev) ;
	
}
