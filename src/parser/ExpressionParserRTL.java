package parser;

import java.util.List;

import basic.TextConstants;
import exceptions.ParserException;
import expressions.Expression;
import expressions.Sum;
import expressions.SumRTL;
import expressions.Summand;
import operators.Addition;
import operators.BinaryOperator;
import operators.OperatorTokenToOperatorAssignment;
import tokens.*;
/**
 * Evaluates sums from right to left, e.g. 10 - 7 - 3 = 6
 */
class ExpressionParserRTL extends ExpressionParser{ 
	public Sum createSum(Summand firstSummand, BinaryOperator op, Expression rest) {
		return new SumRTL(firstSummand, rest, op);
	}
}
