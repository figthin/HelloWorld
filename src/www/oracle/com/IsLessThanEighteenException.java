package www.oracle.com;

public class IsLessThanEighteenException extends Exception{

	public IsLessThanEighteenException() {
		super("Î´Âú18Ëê");
	}
	
	public IsLessThanEighteenException(String message) {
		super(message);
	}
}
