package POM;

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

	public void setGitHubLoginUsername() {
		UN.sendKeys("yojanagaikwad101@gmail.com");
	}

	public void setGitHubLoginPassword() {
		PWD.sendKeys("Anubhav@2004");
	}

	public void clickGitHubLoginBtn() {
		loginBtn.click();
	}
}
