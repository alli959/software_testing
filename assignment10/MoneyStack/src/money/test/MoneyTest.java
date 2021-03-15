package money.test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import money.methods.Money;
import money.methods.MoneyStack;


public class MoneyTest {
	private Money money;
	private MoneyStack stack;

	@Before
	public void constructor() {
		money = new Money(10);
		
		
	}
	
	//test for empty

	@Test()
	public void testIsEmpty() {
		Money m = new Money(11);
		MoneyStack s = new MoneyStack();
		assertThat(s.isEmpty(),is(true));
		s.push(money);
		assertThat(s.isEmpty(),is(false));
	}
	
	@Test()
	public void testGetCurrentSize() {
		MoneyStack s = new MoneyStack();
		Money m = new Money(11);
		int length = s.getCurrentSize();
		assertThat(length,is(equalTo(0)));
		s.push(m);
		assertThat(length,is(not(equalTo(s.getCurrentSize()))));
		assertThat(length+1,is(equalTo(s.getCurrentSize())));
	}
	
	
	
	//test for exceptions
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPullAndPopException() {
		MoneyStack s = new MoneyStack();
		Money m = new Money(10);
		int cap = s.getCapacity();
		s.pop();
		
		//push max money objects to the stack
		while(s.getCurrentSize() < cap+1) {
			s.push(m);
		}
		
	}
	
	//test for pull and pop
	
	@Test()
	public void testPullAndPop() {
		Money money = new Money(11);
		MoneyStack stack = new MoneyStack();
		stack.push(money);
		Money newMoney = new Money(22);
		assertThat(stack.pop(),is(equalTo(money)));
		stack.push(money);
		stack.push(newMoney);
		assertThat(stack.pop(),is(not(equalTo(money))));
		stack.push(newMoney);
		assertThat(stack.pop(),is(equalTo(newMoney)));
		
		
	//test for is full array
		
	}
	@Test()
	public void testIsFull() {
		MoneyStack s = new MoneyStack();
		Money m = new Money(10);
		int cap = s.getCapacity();
		
		//first test when it isn't full
		assertThat(s.isFull(),is(false));
		
		//add 10 money objects to s
		
		while(s.getCurrentSize() != cap) {
			s.push(m);
		}
		assertThat(s.isFull(),is(true));
	}
	

}
