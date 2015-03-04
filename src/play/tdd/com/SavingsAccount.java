package play.tdd.com;

public class SavingsAccount {
	private int balance = 0;
	
	public int balance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}	

}
