package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		//7. cssSelector
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("qa@gmail.com");
		
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("1234567890");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();//button, link, check box, radio button - click()
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}
}
