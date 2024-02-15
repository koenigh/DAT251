package tokens;
public class NaturalNumberToken implements Token {
/**
 * A token carrying a nat number value
 */
	private Integer value;
	public NaturalNumberToken(Integer value) {
		super();
		this.value = value;
		assert this.value >= 0 : "Fataler Fehler: Wert eines NaturalNumber-Tokens war negativ";
	}
	public Integer getValue() {
		return this.value;
	}
	public String toString() {
		return this.value+"";
	}
}
