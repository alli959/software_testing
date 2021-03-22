package moneystack.moneyTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import moneystack.money.Money;

public class MoneyTest {

	private Money m12;
	private Money m14;

	@Before
	public void constructMoneyTestObjects() {
		m12 = new Money(12);
		m14 = new Money(14);
	}

	@Test()
	public void testEquals() {
		Money equalMoney = new Money(12);
		int test = 12;
		assertTrue(m12.equals(m12));
		assertTrue(m12.equals(equalMoney));
		assertFalse(m12.equals(m14));
		assertFalse(m12.equals(test));
	}
	
	@Test
	public void testToString()
	{
		assertThat(m12.toString(),is(Integer.toString(m12.getAmount())));
	}

	@Test
	public void testAdd() {
		Money expected = new Money(26);
		assertThat(m12.add(m14), is(equalTo(expected)));
	}
}