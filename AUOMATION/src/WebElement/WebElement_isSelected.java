package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);

		WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		System.out.println(male.isSelected());// false

		male.click();
		System.out.println(male.isSelected());// true

		Thread.sleep(2000);

		driver.quit();
	}
}
