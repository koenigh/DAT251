package tokens;

import basic.TextConstants;
/**
 * The (one and only) (-token
 */
public class BracketClose implements Token {
/**
 * Singleton-Entwurfsmuster: Einzige Instanz 
 */	
	private static BracketClose theInstance;
	private BracketClose(){
		super();
	}
/**
 * Gibt DIE einzige Instanz zurück
 */	
	public static BracketClose getTheInstance(){
		if (theInstance==null) theInstance = new BracketClose();
		return theInstance;
	}
	public String toString(){
		return TextConstants.BRACKETCLOSE.toString();
	}
}
