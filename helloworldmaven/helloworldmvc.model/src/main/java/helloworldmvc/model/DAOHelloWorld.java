package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	private static String FileName = "Bonjour.txt";
	private static DAOHelloWorld instance = new DAOHelloWorld();
	private String helloWorldMessage = null;
	
	private DAOHelloWorld() {
		
	}
	
	public static DAOHelloWorld getInstance() {
		return instance;
	}
	
	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	
	private void readFile() throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader(DAOHelloWorld.FileName));
		
		String line;
		
		while ((line = in.readLine()) != null) {
			setHelloWorldMessage(line);
		}
		
		in.close();
		
	}
	
	public String getHelloWorldMessage() throws IOException {
		readFile();
		return helloWorldMessage;
		
	}
	
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

	
}
