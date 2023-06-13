package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_getTitle {

	public static void main(String[] args) throws InterruptedException {
		String expTitle = "Downloads | Selenium";
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(2000);

		// 6. getTitle()
		String actTitle = driver.getTitle();
		System.out.println(actTitle);// Downloads | Selenium

		if (actTitle.equals(expTitle)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		//7. getCurrentUrl()
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);//https://www.selenium.dev/downloads/
		
		Thread.sleep(2000);
		driver.quit();
	}
}
