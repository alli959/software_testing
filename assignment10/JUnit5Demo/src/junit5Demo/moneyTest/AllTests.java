package junit5Demo.moneyTest;

import org.junit.runner.RunWith; // This imports in fact from JUnit 4!
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;

@RunWith(JUnitPlatform.class) // This @RunWith annotation is in fact from JUnit4 that use the JUnitPlatform class from Junit 5
@IncludeClassNamePatterns(".*")
@SelectClasses({ MoneyTest.class, MoneyTestWithFixture.class, MoneyTestWithAssertThat.class })
public class AllTests {
	// the class remains completely empty,
	// being used only as a holder for the above annotations
}
