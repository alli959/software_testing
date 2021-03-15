package money.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


import money.methods.Money;
import money.methods.MoneyStack;

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
		int currSum = 0;
		Money m1 = new Money(1);
		Money m5 = new Money(5);
		Money m10 = new Money(10);
		Money m50 = new Money(50);
		Money m100 = new Money(100);
		Money m500 = new Money(500);
		Money m1000 = new Money(1000);
		Money m5000 = new Money(5000);
		Money m10000 = new Money(10000);
		
		s.push(m5);
		currSum += 5;
		assertThat(s.sum(),is(equalTo(currSum)));
		
		s.push(m10000);
		s.push(m5000); //top of the stack
		currSum += 10000;
		currSum += 5000;
		assertThat(s.sum(),is(equalTo(currSum)));
		
		s.pop();
		assertThat(s.sum() == currSum - 5000, is(true));
		
		
	}
	
	//Test with Mockito
	@Test
	public void TestSumMockito() {
		int sum = stack.sum();
		verify(stack).sum(); // check for sum of the empty stack
		assertEquals(0, sum); // should be equal to 0
		
		int amount = money.getAmount();
		verify(money).getAmount();
		stack.push(money);
		//verify(stack, times(1)).money.getAmount());

	}

}
