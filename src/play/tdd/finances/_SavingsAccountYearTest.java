package play.tdd.finances;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class _SavingsAccountYearTest {

	@Test
	public void startingBalance() {
		SavingsAccountYear account = createAccount();
		assertEquals(100, account.startingBalance());
	}

	private SavingsAccountYear createAccount() {
		SavingsAccountYear account = new SavingsAccountYear(100, 10);
		return account;
	}
	
	@Test
	public void interestRate() {
		SavingsAccountYear account = createAccount();
		assertEquals(10, account.interestRate());
	}
	
	@Test
	public void endingBalance() {
		SavingsAccountYear account = createAccount();
		assertEquals(110, account.endingBalance());		
	}
	
	@Test
	public void nextYearStartingBalanceShouldEqualThisYearsEndingBalance() {
		SavingsAccountYear thisYear = createAccount();
		assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());		
	}

	@Test
	public void nextYearsInterestRateEqualsThisYearsInterestRate() {
		SavingsAccountYear thisYear = createAccount();
		assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
	}
	
	
}
