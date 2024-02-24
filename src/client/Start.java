package client;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import facade.ApplicationServices;

public class Start {

	public static void main(String[] args) {
		setSystemLookAndFeel();
		View view = new View();
		ApplicationServices facade = new ApplicationServices();
		Controller controller = new Controller(view, facade);
		view.setVisible(true); 
	}
	private static void setSystemLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Could not set current Look and Feel. Using standard L&F instead.");
		}
	}
}
