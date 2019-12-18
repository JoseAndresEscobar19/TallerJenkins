package prima;

public class InvalidEdadException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8730769777721243020L;
	private static final String message = "Edad solo puede tener valores enteros entre 18 y 90";
	
	public InvalidEdadException() {
		super();
	}
	@Override
	public String getMessage() {
		return message;
	}
}
