package parser;

import expressions.Factor;
import expressions.Product;
import expressions.ProductLTR;
import expressions.Summand;
import operators.BinaryOperator;
/**
 * Enables evaluation of products from left to right, e.g. 100 / 10 * 2 = 20 
 */
public class SummandParserLTR extends SummandParser {
/**	
 * Product als S*F zusammen setzen 
 */
	public Product createProduct(Factor firstFactor, BinaryOperator op, Summand rest) {
		if(rest instanceof Factor) 	
			return new ProductLTR(firstFactor, (Factor)rest, op);
		if(rest instanceof ProductLTR) {
			ProductLTR restProduct = (ProductLTR) rest;
			return new ProductLTR(this.createProduct(firstFactor, op, restProduct.getArg1()), restProduct.getArg2(), restProduct.getOp());
		}
			
		assert false: "Fatal Error when creating product in LTR mode: Rest-Expression was neither Factor nor Product!"; 
		return null;
	}
}
