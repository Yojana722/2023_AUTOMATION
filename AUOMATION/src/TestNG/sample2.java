package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {

	@Test
	public void TC4() {
		Reporter.log("running TC4", true);
	}
	
	@Test
	public void TC5() {
		//Assert.fail();
		Reporter.log("running TC5", true);
	}
	
	@Test
	public void TC6() {
		Reporter.log("running TC6", true);
	}
	
	@Test
	public void TC7() {
		Reporter.log("running TC7", true);
	}
}
