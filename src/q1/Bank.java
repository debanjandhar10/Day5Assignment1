package q1;


public abstract class Bank {
	protected int balance;
	abstract public int getBalance();
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
