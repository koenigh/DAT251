package client;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import client.states.ViewState;
import client.states.ViewStateSyntaxOk;
import client.states.ViewStateUnchecked;
import exceptions.CalculationException;
import exceptions.ParserException;
import facade.ApplicationServices;
import treeModelCreator.TreeModelCreator;

public class Controller{
	private static final String syntaxok = "Syntax OK";
	private View view;				  // The View
	private ApplicationServices model;  // The Model
	private ViewState viewState;
	private TreeModelCreator treeModelCreatorSimple;
	public Controller(View view, ApplicationServices facade) {
		this.view = view; 
		this.model = facade;
		this.viewState = new ViewStateUnchecked(this);
		this.treeModelCreatorSimple = new TreeModelCreator();
		this.view.getTreeDisplay().setModel(this.treeModelCreatorSimple.initialize());
		this.registerListeners();
	}
	public View getView() {
		return this.view;
	}
	private void registerListeners() {
		this.getView().getBtnCheckSyntaxButton().addActionListener((e)->onCheckSyntaxButtonPressed()); 
		this.getView().getBtnEvaluateButton().addActionListener((e)->onEvaluationButtonPressed(e));
		this.view.getTextField_Input().addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				// Nothing
			} 
			public void keyReleased(KeyEvent e) {
				// Nothing 
			}
			public void keyPressed(KeyEvent e) {
				onInputChange();
			}
		});
	}
	private void onInputChange() {
		this.viewState = new ViewStateUnchecked(this);
		this.initializeTreeDisplay();
	}
/**	
 * Follow up action after having pressed "check syntax" button 
 */	
	public void onCheckSyntaxButtonPressed() {
		try { 
			this.initializeValue();
			this.view.getTreeDisplay().setModel(
					this.treeModelCreatorSimple.create(this.model.checkSyntax(this.view.getInput()))
			);
			this.view.getTreeDisplay().expandRow(0);
			this.viewState = new ViewStateSyntaxOk(this);
			this.view.setMessage(syntaxok);
		} catch (ParserException exception) {
			this.errorHandling(exception);
		}
	}

/**	
 * Follow up action after having pressed the evaluation button 
 * @param event may be used for analysing event features 
 */
	public void onEvaluationButtonPressed(ActionEvent event) {
		try {
			this.view.setValue(this.model.evaluate(this.view.getInput()).toString()); 
			this.view.setMessage("Evaluation successfully performed"); // on " + new Date(event.getWhen()).toString()); // An example for the use of the ActionEvent
		}catch(ParserException|CalculationException exception) {
			this.errorHandling(exception);
		}
	}
/**	
 * Actions on occurrence of errors
 */
	private void errorHandling(Exception exception) {
		this.viewState = new ViewStateUnchecked(this);
		this.view.setMessage(exception.getMessage());
		this.initializeTreeDisplay();
	}
/**	
 * Initialization of value field
 */
	public void initializeValue() {
		this.view.setValue("");
	}
/**	
 * Tree Initialization
 */
	private void initializeTreeDisplay() {
		this.view.getTreeDisplay().setModel(this.treeModelCreatorSimple.initialize());
	}
}