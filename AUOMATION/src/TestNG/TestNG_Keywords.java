package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	//1. invocationCount
	//3. enabled
	@Test(invocationCount = 5, enabled = false)
	public void TC1() {
		Reporter.log("running TC1");
	}
	
	//2. priority
	//3. timeOut
	@Test(priority = 2, timeOut = 2000)
	public void TC2() throws InterruptedException {//TC2() didn't finish within the time-out 2000
		Thread.sleep(3000);
		Reporter.log("running TC2");
	}
	
	@Test(priority = 2, dependsOnMethods = {"TC2"})
	public void TC3() {
		Reporter.log("running TC3");
	}
	
	@Test(priority = 3)
	public void TC4() {
		Reporter.log("running TC4");
	}
	
	@Test(priority = 1)
	public void TC5() {
		Reporter.log("running TC5");
	}
	
	@Test(dependsOnMethods = {"TC4","TC5"})
	public void TC6() {
		Reporter.log("running TC6");
	}
}
