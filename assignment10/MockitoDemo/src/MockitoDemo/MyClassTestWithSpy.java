package MockitoDemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class MyClassTestWithSpy {
	MyClass mySpy;

	@Before
	public void setUp() throws Exception {
		MyClass myObject = new MyClass();
		mySpy=spy(myObject); 
	}

	@Test
	public void testLengthOfWithSpy() {
		int result = mySpy.lengthOf("Hello World!");
		verify(mySpy).lengthOf("Hello World!"); // Check that method was called with expected parameter
		assertEquals(12, result); // In contrast to the version with mock(MyClass), the spy preserves the behaviour
	}

	@Test
	public void testMultiplyByFactorTenWithSpyWhenThenReturn() {
		when(mySpy.multiplyByFactorTen(1)).thenReturn(42); // First, the real method is called, only return value is changed afterwards
		int result = mySpy.multiplyByFactorTen(1);
		assertEquals(42, result);
		result = mySpy.multiplyByFactorTen(2);
		assertEquals(20, result);
	}

	@Test
	public void testMultiplyByFactorTenWithSpyWDoReturnWhen() {
		doReturn(42).when(mySpy).multiplyByFactorTen(1); // Real method is fully replaced
		int result = mySpy.multiplyByFactorTen(1);
		assertEquals(42, result);
		result = mySpy.multiplyByFactorTen(2);
		assertEquals(20, result);
	}

}
