package www.oracle.com;

public class BankAccount {

	private int account;
	private double balance;
	
	
	
	public BankAccount() {
		super();
	}



	public BankAccount(int account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}



	public int getAccount() {
		return account;
	}



	public void setAccount(int account) {
		this.account = account;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double drawMoney(double amount) throws AccountNotEnoughException{
		if(amount > balance) {
			throw new AccountNotEnoughException("Óà¶î²»×ã£¡µ±Ç°Óà¶î£º" + balance);
		}
		balance -= amount;
		return balance;
	}
}
