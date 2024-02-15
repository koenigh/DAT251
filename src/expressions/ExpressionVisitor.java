package expressions;
/**
 * Part of visitor pattern in order to distinguish different types of Expressions
 * Type parameter T types return of handle-methods
 */
public interface ExpressionVisitor {
	public void handle(Sum s);
	public void handle(Product p);
	public void handle(BracketExpression be);
	public void handle(NaturalNumber c);
}
