package tokens;

import java.util.HashMap;
import java.util.Map;

import basic.TextConstants;
/**
 * Singleton to define valid operator symbols
 */
public class TokenTable {
// ======= Singleton Logic ============= 	
	private static TokenTable instance = new TokenTable();
	private Map<Character, Token> tokenPerCharacter; 
	private TokenTable(){
		this.fillSymbolMap();
	}
	public static TokenTable getInstance(){
		return instance;
	}
// ====================================	
	
	public boolean exists(Character key){
		return this.tokenPerCharacter.containsKey(key);
	}
	public Token get(Character key){
		return this.tokenPerCharacter.get(key);
	}
	
	private void fillSymbolMap(){
		this.tokenPerCharacter = new HashMap<Character, Token>();
		this.tokenPerCharacter.put(TextConstants.BRACKETOPEN, BracketOpen.getTheInstance());
		this.tokenPerCharacter.put(TextConstants.BRACKETCLOSE, BracketClose.getTheInstance());
		this.tokenPerCharacter.put(TextConstants.ADD, AdditionSymbol.getTheInstance());
		this.tokenPerCharacter.put(TextConstants.SUB, SubtractionSymbol.getTheInstance());
		this.tokenPerCharacter.put(TextConstants.MULTIPLY, MultiplicationSymbol.getTheInstance());
		this.tokenPerCharacter.put(TextConstants.DIV, DivisionSymbol.getTheInstance());
	}
}
