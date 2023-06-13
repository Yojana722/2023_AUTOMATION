package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verification_AssertClass_Disadvantage {

	//Hard Assert
	@Test
	public void test() {
		String expResult = "good morning";
		String actResult = "good night";
		boolean result = false;
		
		//verification 1
		Assert.assertNotEquals(actResult, expResult, "verification 1: act & exp result is equal");
		
		//verification 2
		Assert.assertEquals(actResult, expResult, "verification 2: act & exp result is not equal");
		
		//verification 3
		Assert.assertTrue(result, "verification 3: result is false");
		
		//java.lang.AssertionError: verification 2: act & exp result is not equal expected [good morning] but found [good night]
	}
}
