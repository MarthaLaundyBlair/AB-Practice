
public class BadLineException extends Exception {

	String lineText;

	
	
	public BadLineException(String message, String lineText) {
		super(message);
		this.lineText = lineText;
	}



	public String getLineText() {
		return lineText;
	}
	
	
}
