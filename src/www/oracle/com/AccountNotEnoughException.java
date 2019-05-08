package www.oracle.com;

public class AccountNotEnoughException extends Exception {

	public AccountNotEnoughException() {

	}

	public AccountNotEnoughException(String message) {
		super(message);
	}
}
