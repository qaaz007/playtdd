package play.tdd.finances;

public class SavingsAccountYear {
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
	
	public SavingsAccountYear nextYear(int interestRate){
		SavingsAccountYear result = new SavingsAccountYear();
		result.deposit(balance() + (balance() * interestRate / 100));
		return result;
	}

}
