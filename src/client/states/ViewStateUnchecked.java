package client.states;

import client.Controller;
import client.states.ViewState;

public class ViewStateUnchecked extends ViewState {
	public ViewStateUnchecked(Controller theController) {
		super(theController);
	}
	protected void enter() {
		this.getTheController().initializeValue();
		this.getTheController().getView().setMessage("");
		this.getTheController().getView().setCheckBtnVisibility(true);
		this.getTheController().getView().setEvaluationButtonVisibility(false);
	}
}
