package www.oracle.com;

public class IsLessThanEighteenException extends Exception{

	public IsLessThanEighteenException() {
		super("δ��18��");
	}
	
	public IsLessThanEighteenException(String message) {
		super(message);
	}
}
