package helloworldmvc.controller;

import java.io.IOException;

import helloworldmvc.contract.IModel;
import helloworldmvc.contract.IView;

public class Controller {
	private final IView view;
	private final IModel model;
	
	public Controller(IView view, IModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void run() throws IOException {
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
