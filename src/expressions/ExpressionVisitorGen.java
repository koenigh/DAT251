package expressions;
/**
 * Part of visitor pattern in order to distinguish different types of Expressions
 * Type parameter T types return of handle-methods
 */
public interface ExpressionVisitorGen<T> {
	public T handle(Sum s);
	public T handle(Product p);
	public T handle(BracketExpression be);
	public T handle(NaturalNumber c);
}
