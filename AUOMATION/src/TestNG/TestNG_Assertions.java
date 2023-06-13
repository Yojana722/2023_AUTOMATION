package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {// Verification methods

	//Hard Assert
	// 1. assertEquals
	@Test
	public void test1() {
		Reporter.log("running test1", true);
		String expResult = "good morning";
		String actResult = "good morning";

		Assert.assertEquals(actResult, expResult, "act & exp result is not equal");
	}

	// 2. assertNotEquals
	@Test
	public void test2() {
		Reporter.log("running test2", true);
		String expResult = "good morning";
		String actResult = "good night";

		Assert.assertNotEquals(actResult, expResult, "act & exp result is equal");

	}

	// 3. assertTrue
	@Test
	public void test3() {
		Reporter.log("running test2", true);
		boolean result = true;

		Assert.assertTrue(result, "result is false");

	}
	
	//4. assertFalse
	@Test
	public void test4() {
		Reporter.log("running test4", true);
		boolean result = false;
        
		Assert.assertFalse(result, "result is true");
	}
	
	//5. assertNotNull
	
	@Test
	public void test5() {
		Reporter.log("running test5", true);
		String result = "quantum";
		
		Assert.assertNotNull(result, "result is null");
	}
	
	//6. assertNull
	@Test
	public void test6() {
		Reporter.log("running test6", true);
		String result = null;
		
		Assert.assertNull(result, "result is not null");
 	}
	
	//7. fail
	@Test
	public void test7() {
		Reporter.log("running test7", true);
		Assert.fail();
 	}
	

}
