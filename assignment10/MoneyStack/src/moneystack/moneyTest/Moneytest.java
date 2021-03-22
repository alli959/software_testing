package moneystack.moneyTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



import moneystack.money.Money;
import moneystack.money.MoneyStack;


public class Moneytest {
	private Money money;

	@Before
	public void constructor() {
		money = new Money(10);
		MoneyStack s = new MoneyStack();
		
		
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
	
	
	//exception, length of s < 0
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPopException() {
		MoneyStack s = new MoneyStack();
		Money m = new Money(10);
		s.pop();
		
		}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPushException() {
		MoneyStack s = new MoneyStack();
		int cap = s.getCapacity();
		//push max money objects to the stack
		Money m = new Money(10);
		try {
			
			while(s.getCurrentSize() < cap) {
				
				s.push(m);
			}
		} catch (Exception e) {
			fail("Exception accured on not yet full stack");
		}
		s.push(money);
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
