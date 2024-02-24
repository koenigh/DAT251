package main;
import exceptions.CalculationException;
import exceptions.ParserException;
import facade.ApplicationServices;

public class Main {
	public static void main(String[] args) {
		String input = "(8+9)*7";
		ApplicationServices facade = new ApplicationServices();
		try {
			facade.checkSyntax(input);
			System.out.println(facade.evaluate(input));
		}catch(ParserException | CalculationException e) {
			System.out.println(e.getMessage());
		}
	}

}
