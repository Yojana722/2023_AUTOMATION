package DDF_POM_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login {

	@FindBy(xpath = "//input[@id='login_field']")
	private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PWD;
	@FindBy(css = "input[type='submit']")
	private WebElement loginBtn;

	public GitHub_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setGitHubLoginUsername(String username) {
		UN.sendKeys(username);
	}

	public void setGitHubLoginPassword(String password) {
		PWD.sendKeys(password);
	}

	public void clickGitHubLoginBtn() {
		loginBtn.click();
	}
}
