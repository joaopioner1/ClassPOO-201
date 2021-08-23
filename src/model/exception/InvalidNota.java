package model.exception;

public class InvalidNota extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidNota(String msg) {
		super(msg);
	}
}
