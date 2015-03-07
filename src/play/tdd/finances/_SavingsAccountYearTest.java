package play.tdd.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingsAccountYearTest {

	@Test
	public void depositAndWithdrawl() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(100);
		assertEquals("after deposit", 100, account.balance());
		account.withdraw(50);
		assertEquals("after withdrawl", 50, account.balance());
	}
	
	@Test
	public void negativeBalanceIsJustFine() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.withdraw(75);
		assertEquals("after negative withdrawl", -75, account.balance());
	}
	
	@Test
	public void nextYear() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(100);
		SavingsAccountYear nextYear = account.nextYear(10);
		assertEquals("after interest calculation", 110, nextYear.balance());
	}
	
	@Test
	public void endingBalance() {
		SavingsAccountYear account = new SavingsAccountYear(100, 10);
		assertEquals(110, account.endingBalance());
		
	}

}
