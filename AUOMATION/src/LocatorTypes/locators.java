package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("file:///E:/Yojana/new/March2023/HTML/LoginForm.html");

		Thread.sleep(2000);

		// 1. tagName
		// findElement -> return WebElement
		// WebElement username = driver.findElement(By.tagName("input"));
		// username.sendKeys("qa@123");
		driver.findElement(By.tagName("input")).sendKeys("qa@123");

		// 2. id
		driver.findElement(By.id("pass")).sendKeys("12345");

		// 3. className
		driver.findElement(By.className("abcd")).sendKeys("qa@gmail.com");

		// 4. name
		driver.findElement(By.name("12345")).sendKeys("1234567890");

		// 5. linkText
		// driver.findElement(By.linkText("Link1")).click();

		// 6. partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();

		Thread.sleep(2000);
		driver.quit();
	}
}
