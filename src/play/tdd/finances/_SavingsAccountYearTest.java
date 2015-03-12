package play.tdd.finances;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class _SavingsAccountYearTest {

	@Test
	public void startingBalance() {
		SavingsAccountYear account = new SavingsAccountYear(100, 10);
		assertEquals(100, account.startingBalance());
	}
	
	@Test
	public void endingBalance() {
		SavingsAccountYear account = new SavingsAccountYear(100, 10);
		assertEquals(110, account.endingBalance());		
	}
	
	@Test
	public void nextYearStartingBalanceShouldEqualThisYearsEndingBalance() {
		SavingsAccountYear thisYear = new SavingsAccountYear(100, 10);
		assertEquals(thisYear.endingBalance(), thisYear.nextYear().startingBalance());		
	}

	@Test
	public void nextYearsInterestRateEqualsThisYearsInterestRate() {
		SavingsAccountYear thisYear = new SavingsAccountYear(100, 10);
		assertEquals(thisYear.interestRate(), thisYear.nextYear().interestRate());
	}

}
