package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://github.com/");

		Thread.sleep(2000);

		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickGitHubSignInBtn();

		Thread.sleep(2000);

		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUsername();
		login.setGitHubLoginPassword();
		login.clickGitHubLoginBtn();

		Thread.sleep(2000);

		GitHub_Home home = new GitHub_Home(driver);
		home.clickGitHubHomePageSignOutBtn();

		Thread.sleep(2000);

		GitHub_SignOut signOut = new GitHub_SignOut(driver);
		signOut.clickGitHubSignOutBtn();

		Thread.sleep(2000);
		driver.quit();
	}
}
