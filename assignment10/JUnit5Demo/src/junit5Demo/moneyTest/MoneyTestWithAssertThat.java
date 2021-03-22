package junit5Demo.moneyTest;

import junit5Demo.Money;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat; // The Eclipse project contains a JAR with hamcrest 2.x 
import static org.hamcrest.Matchers.*; // In the Eclipse Java buils path order, hamcrest 2.x must come before JUnit5, because Eclipse's JUnit5 has hamcrest 1.3 included leading to conflicts

public class MoneyTestWithAssertThat {

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
		assertThat(m12,is(equalTo(m12)));
		assertThat(m12,is(equalTo(equalMoney)));
		assertThat(m12,is(not(equalTo(m14))));
	}

	@Test
	public void testAddUsingFixture() {
		Money expected = new Money(26);
		assertThat(m12.add(m14), is(equalTo(expected)));
	}
}
