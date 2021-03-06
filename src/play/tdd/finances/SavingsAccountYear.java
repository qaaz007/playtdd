package play.tdd.finances;

public class SavingsAccountYear {
	private int startingBalance = 0;
	private int interestRate = 0;
	
	public SavingsAccountYear() {}
	
	public SavingsAccountYear(int balance, int interestRate) {
		this.startingBalance = balance;
		this.interestRate = interestRate;
	}

	public int startingBalance() {
		return startingBalance;
	}

	public int interestRate() {
		return interestRate;
	}	

	public int endingBalance() {
		return startingBalance + (startingBalance * interestRate / 100);
	}
	
	public SavingsAccountYear nextYear(){
		return new SavingsAccountYear(this.endingBalance(), this.interestRate());
		
	}
}
