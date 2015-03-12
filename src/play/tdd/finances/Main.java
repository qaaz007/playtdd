package play.tdd.finances;

public class Main {

	public static void main(String[] args) {
		SavingsAccountYear account = new SavingsAccountYear(100, 10);		
		for(int i=0; i<10; i++){
			System.out.println(i + ": " + account.balance());
			account = account.nextYear();
		}

	}
}
