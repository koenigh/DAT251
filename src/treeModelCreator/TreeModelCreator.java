package treeModelCreator;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import expressions.BinaryTerm;
import expressions.BracketExpression;
import expressions.Expression;
import expressions.ExpressionVisitor;
import expressions.NaturalNumber;
import expressions.Product;
import expressions.Sum;
/**
 * Responsible for creating the tree model from an expression object
 * Visits expression objects 
 */
public class TreeModelCreator implements ExpressionVisitor{
	private DefaultMutableTreeNode cursor; // The current node during tree creation
	private DefaultTreeModel theTreeModel;
	public TreeModelCreator() {
		super(); 
		this.cursor = new DefaultMutableTreeNode("Root");  
		this.theTreeModel = null;
	}
	public DefaultTreeModel initialize() {
		return new DefaultTreeModel(new DefaultMutableTreeNode("Unchecked Expression"));
	}
	public DefaultTreeModel create(Expression e){
		this.theTreeModel = new DefaultTreeModel(this.cursor);
		e.accept(this);
		return this.theTreeModel;
	}
	public void handle(BracketExpression be) {
		this.setCursorText(be);
		DefaultMutableTreeNode arg = new DefaultMutableTreeNode("");
		this.cursor.add(new DefaultMutableTreeNode(be.getBracketOpen()));
		this.cursor.add(arg);
		this.cursor.add(new DefaultMutableTreeNode(be.getBracketClose()));
		this.cursor = arg;
		be.getExpression().accept(this);
	}
/**	
 * Common handling of binary terms
 */	public void handle(Sum s) {
		this.doHandle(s);
	}
	public void handle(Product p) {
		this.doHandle(p);
	}	
	private void doHandle(BinaryTerm bt){
		this.setCursorText(bt);
		DefaultMutableTreeNode arg1 = new DefaultMutableTreeNode("");
		DefaultMutableTreeNode arg2 = new DefaultMutableTreeNode("");
		this.cursor.add(arg1);
		this.cursor.add(new DefaultMutableTreeNode(bt.getOp()));
		this.cursor.add(arg2);
		
		this.cursor = arg1;
		// Todo: Create the tree under the first argument
		this.cursor = arg2; 
		// Todo: Create the tree under the second argument
	}
	public void handle(NaturalNumber n) {
		this.cursor.setUserObject(n);
	}
	
// =============== Auxiliary ==============================
/**	
 * Determines a textual representation of the node type in the tree
 */
	private void setCursorText(Expression e){
		this.cursor.setUserObject(e.getClass().getSimpleName());
	}
}
