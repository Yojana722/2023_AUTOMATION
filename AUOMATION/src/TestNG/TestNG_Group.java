package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Group {

	@Test(groups = "facebook")
	public void TC1() {
		Reporter.log("running TC1", true);
	}

	@Test(groups = "WhatsApp")
	public void TC2() {
		Reporter.log("running TC2", true);
	}

	@Test(groups = "Gmail")
	public void TC3() {
		Reporter.log("running TC3", true);
	}

	@Test(groups = "Gmail")
	public void TC4() {
		Reporter.log("running TC4", true);
	}

	@Test(groups = "facebook")
	public void TC5() {
		Reporter.log("running TC5", true);
	}

	@Test(groups = "Amazon")
	public void TC6() {
		Reporter.log("running TC6", true);
	}

	@Test(groups = "WhatsApp")
	public void TC7() {
		Reporter.log("running TC7", true);
	}
}
