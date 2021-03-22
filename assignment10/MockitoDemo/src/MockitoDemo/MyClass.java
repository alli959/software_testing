package MockitoDemo;

public class MyClass {
	int lengthOf(String aString) {
		System.out.println("MockitoDemo.MyClass.lengthOf(" + aString + ")");
		return aString.length();
	}

	int multiplyByFactorTen(int x) {
		System.out.println("MockitoDemo.MyClass.multiplyByFactorTen(" + x + ")");
		return 10 * x;
	}
}
