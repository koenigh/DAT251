package main;
import exceptions.CalculationException;
import exceptions.ParserException;
import facade.ApplicationFacade;

public class Main {
	public static void main(String[] args) {
		String input = "(8+9)*7";
		ApplicationFacade facade = new ApplicationFacade();
		try {
			facade.checkSyntax(input);
			System.out.println(facade.evaluate(input));
		}catch(ParserException | CalculationException e) {
			System.out.println(e.getMessage());
		}
	}

}
