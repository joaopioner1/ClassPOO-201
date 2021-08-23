package exceptions;

public class InvalidPageNumber extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InvalidPageNumber(String msg) {
		super(msg);
	}
}
