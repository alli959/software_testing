package MockitoDemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

// Note: no meaningful testing using mock objects, just demo of Mockito
public class MyClassTestWithMock {
	MyClass myMock;

	@Before
	public void setUp() throws Exception {
		myMock = mock(MyClass.class);

	}

	@Test
	public void testLengthOfWithMock() {
		int result = myMock.lengthOf("Hello World!");
		verify(myMock).lengthOf("Hello World!"); // Check that method was called with expected parameter
		assertEquals(0, result); // In fact, dummy method of mock was called (returning 0)
	}

	@Test
	public void testMultiplyByFactorTenWithMock() {
		when(myMock.multiplyByFactorTen(1)).thenReturn(42); // Change return value
		int result = myMock.multiplyByFactorTen(1);
		assertEquals(42, result);
		result = myMock.multiplyByFactorTen(2);
		assertEquals(0, result);
	}

}
