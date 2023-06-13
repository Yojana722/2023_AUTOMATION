package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		//1. XPATH by Attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qa@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		
		//2. XPATH by Text
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//3. XPATH by contains
		//driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		//4. XPATH by Index
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
