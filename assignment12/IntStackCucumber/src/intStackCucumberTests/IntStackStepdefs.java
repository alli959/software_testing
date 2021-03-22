package intStackCucumberTests;

import intStack.IntStack;

import io.cucumber.java.en.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class IntStackStepdefs {
	private IntStack theStack;
	private Boolean actualBooleanAnswer;
	private int currentSize;

	@Given("a new stack$")
	public void newStack() {
		theStack = new IntStack();
	}

	@When("I check whether it is empty")
	public void checkWhetherItIsEmpty() {
		actualBooleanAnswer = theStack.isEmpty();
	}
	@Then("it should answer yes")
	public void itShouldAnswerYes() {
		assertTrue(actualBooleanAnswer);
	}
	@When("I check whether it is full")
	public void iCheckWhetherItIsFull() {
	    actualBooleanAnswer = theStack.isFull();
	}

	@Then("it should answer no")
	public void itShouldAnswerNo() {
	    assertFalse(actualBooleanAnswer);
	}
	
	@When("I push value {int}")
	public void iPushValue(int value) {
		theStack.push(value);
	}

	@Then("the pop value should answer {int}")
	public void thePopValueShouldAnswer(Integer value) {
		assertThat(theStack.pop(),is(value));
	}
	
	@When("I push value {int} {int} times and check whether it is full then pop")
	public void iPushValueTimesAndCheckWhetherItIsFullThenPop(int value, int times) {
		for(int i = 0; i < times; i++) {
			theStack.push(value);
		}
		actualBooleanAnswer = theStack.isFull();
	}

	@Then("it should answer yes and {int}")
	public void itShouldAnswerYesAnd(int value) {
		assertTrue(actualBooleanAnswer);
		assertThat(theStack.pop(),is(value));
	}
	
	@When("I check on the size")
	public void iCheckOnTheSize() {
		currentSize = theStack.getCurrentSize();
	}

	@Then("it should answer {int}")
	public void itShouldAnswerFail(int value) {
	    assertThat(currentSize,is(value));
	}
	
	@When("I push value {int}")
	public void IpushValueOne(int value) {
		theStack.push(value);
		currentSize = theStack.getCurrentSize();
	}

	@Then("it should answer {int}")
	public void itShouldAnswer(int value) {
	    assertThat(currentSize,is(value));
	}
	
	
	

}