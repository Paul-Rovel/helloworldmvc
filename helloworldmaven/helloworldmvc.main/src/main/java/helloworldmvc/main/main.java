package helloworldmvc.main;

import java.io.IOException;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class main {

	public static void main(String[] args) throws IOException {
		final Model model = new Model();
		final View view = new View();
		final Controller cont = new Controller(view, model);
		cont.run();
		
	}

}
