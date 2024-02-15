package parser;

import expressions.Factor;
import expressions.Product;
import expressions.ProductRTL;
import expressions.Summand;
import operators.BinaryOperator;
/**
 * Responsible for parsing expressions of shape "F*S", "F/S", or "F"
 * Enables evaluation from right to left, e.g. 100 / 10 / 2 = 20
 */
class SummandParserRTL extends SummandParser{
	SummandParserRTL(){
		super();
	}
	public Product createProduct(Factor firstFactor, BinaryOperator op, Summand rest) {
		return new ProductRTL(firstFactor, rest, op);
	}
}
