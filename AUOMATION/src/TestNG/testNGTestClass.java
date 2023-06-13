package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGTestClass {

	@Test//marks a class or a method as part of the test
	public void test() {
		System.out.println("good night");//this will print msg in console not in report
		Reporter.log("good night", false);//msg will not display in console, but will display in report
		Reporter.log("good night", true);//msg will display in console as well as in report
	}
}
