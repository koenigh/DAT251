package client.states;

import client.Controller;
import client.states.ViewState;

public class ViewStateSyntaxOk extends ViewState {
	public ViewStateSyntaxOk(Controller theController) {
		super(theController);
	}
	protected void enter() {
		this.getTheController().getView().setMessage("");
		this.getTheController().getView().setCheckBtnVisibility(true);
		this.getTheController().getView().setEvaluationButtonVisibility(true);
	}
}
