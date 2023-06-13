package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAnnotations {

	@DataProvider(name="data-provider")
	public Object[][] dpMethod() {
		return new Object[][] {{"Automation Testing"}, {"Manual Testing"},
			{"Database Testing"}, {"API Testing"}};		
	}
	
	@Test(dataProvider = "data-provider")
	public void TC1(String value) {
		System.out.println(value);
	}
}
