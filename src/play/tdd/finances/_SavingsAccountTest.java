package play.tdd.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingsAccountTest {

	@Test
	public void depositAndWithdrawl() {
		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		assertEquals("after deposit", 100, account.balance());
		account.withdraw(50);
		assertEquals("after withdrawl", 50, account.balance());
	}
	
	@Test
	public void negativeBalanceIsJustFine() {
		SavingsAccount account = new SavingsAccount();
		account.withdraw(75);
		assertEquals("after negative withdrawl", -75, account.balance());
	}
	
	@Test
	public void nextYear() {
		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		SavingsAccount nextYear = account.nextYear(10);
		assertEquals("after interest calculation", 110, nextYear.balance());
	}

}
