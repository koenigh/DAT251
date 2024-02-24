package client.states;

import client.Controller;

public abstract class ViewState {
	private Controller theController;
	public ViewState(Controller theController) {
		super();
		this.theController = theController;
		this.enter();
	}

	public Controller getTheController() {
		return this.theController;
	}
/**	
 * Actions on entering this state
 */
	protected abstract void enter();
}
