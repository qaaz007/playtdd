package play.tdd.finances;

public class Main {

	public static void main(String[] args) {
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(100);
		for(int i=0; i<10; i++){
			System.out.println(i + ": " + account.balance());
			account = account.nextYear(10);
		}

	}
}
