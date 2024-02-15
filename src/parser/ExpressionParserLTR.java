package parser;

import expressions.Expression;
import expressions.Sum;
import expressions.SumLTR;
import expressions.Summand;
import operators.BinaryOperator;
/**
 * Evaluates sums from left to right, e.g. 10 - 7 - 3 = 0
 */
public class ExpressionParserLTR extends ExpressionParser {
/**	
 * Construct sum as E + S 
 */
	public Sum createSum(Summand firstSummand, BinaryOperator op, Expression rest) {
		if(rest instanceof Summand) 
			return new SumLTR(firstSummand, (Summand)rest, op);
		if(rest instanceof SumLTR) {
			SumLTR restSum = (SumLTR)rest;
			return new SumLTR(this.createSum(firstSummand, op, restSum.getArg1()), restSum.getArg2(), restSum.getOp());
		}
		assert false: "Fatal Error when creating sum in LTR mode: Rest-Expression was neither Summand nor Sum!"; 
		return null;  // Never reached!
	}
}
