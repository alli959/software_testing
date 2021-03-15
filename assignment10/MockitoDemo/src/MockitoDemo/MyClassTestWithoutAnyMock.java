package MockitoDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyClassTestWithoutAnyMock {
	MyClass myClass;

	@Before
	public void setUp() throws Exception {
		myClass = new MyClass();
	}

	@Test
	public void testLengthOf() {
		int result = myClass.lengthOf("Hello World!");
		assertEquals(12, result);
	}

	@Test
	public void testMultiplyByFactorTen() {
		int result = myClass.multiplyByFactorTen(1);
		assertEquals(10, result);
		result = myClass.multiplyByFactorTen(2);
		assertEquals(20, result);
	}

}
