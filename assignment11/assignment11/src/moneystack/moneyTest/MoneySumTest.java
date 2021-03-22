package moneystack.moneyTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


import moneystack.money.*;


public class MoneySumTest {
	private Money money;
	private MoneyStack stack;

	@Before
	public void constructor() {
		money = mock(Money.class);
		stack = mock(MoneyStack.class);
	}

	//Test without Mockito
	@Test
	public void testSum() {
		MoneyStack s = new MoneyStack();
		Money m1 = new Money(10);
		Money m2 = new Money(12);
		s.push(m1);
		s.push(m2);
		assertThat(s.sum(), is(equalTo(22)));
		
	}
	
	//Test with Mockito
	@Test
	public void TestSumMockito() {
		MoneyStack s = new MoneyStack();
		Money m1 = mock(Money.class);
		Money m2 = mock(Money.class);
		
		s.push(m1);
		s.push(m2);
		when(m1.getAmount()).thenReturn(10);
		when(m2.getAmount()).thenReturn(12);
		assertThat(s.sum(), is(equalTo(22)));
		verify(m1).getAmount();
		verify(m2).getAmount();


	}

}
