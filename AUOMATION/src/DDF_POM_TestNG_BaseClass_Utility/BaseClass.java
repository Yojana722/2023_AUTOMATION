package DDF_POM_TestNG_BaseClass_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	static WebDriver driver;
	public static void openBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");

		//Handling notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		driver = new ChromeDriver(option);

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get(Utility.getPropertyFileData("url"));

		Thread.sleep(2000);

	}
}
