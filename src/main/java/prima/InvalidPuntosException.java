package prima;

public class InvalidPuntosException extends RuntimeException {


	private static final long serialVersionUID = -2260722645625468396L;
		private final String message;
		public InvalidPuntosException(final String message){
			super();
			this.message = message;
		}
		@Override
		public String getMessage() {
			return message;
		}
		
}