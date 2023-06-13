package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		/*
		 * WebElement logo =
		 * driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		 * 
		 * boolean result = logo.isDisplayed(); System.out.println(result);//true
		 */

		boolean result;
		try {
			result = driver.findElement(By.xpath("//img[@class='aaafb_logo _8ilh img']")).isDisplayed();
			System.out.println(result);
		} catch (Exception e) {
			result = false;
			System.out.println(result);
		}

		Thread.sleep(2000);
		driver.quit();
	}
}
