package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		//Thread.sleep(2000);
		//driver.quit();
	}
}
