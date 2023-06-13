package DDF_POM_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	// 1. Variable declaration
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signInBtn;
	// signInBtn = driver.findElement(By.xpath(""));

	// 2. Variable Initialization
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. Usage
	public void clickGitHubSignInBtn() {
		signInBtn.click();
	}
}
