package exceptionTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DivisionByZeroJUnit5Test {

	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			int b = 2 / 0;
		});
	}
}