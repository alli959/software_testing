package junit5Demo.moneyTest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import junit5Demo.Money;

public class MoneyTestWithFixture {

	private Money m12;
	private Money m14;

	@BeforeEach
	void constructMoneyTestObjects() {
		m12 = new Money(12);
		m14 = new Money(14);
	}

	@Test
	public void testEqualsUsingFixture() {
		Money equalMoney = new Money(12);
		assertTrue(m12.equals(m12));
		assertTrue(m12.equals(equalMoney));
		assertFalse(m12.equals(m14));
	}

	@Test
	public void testAddUsingFixture() {
		Money expected = new Money(26);
		assertEquals(expected, m12.add(m14));
	}
}
