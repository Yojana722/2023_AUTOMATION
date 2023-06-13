package HandlingOfDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRatingsFromFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.flipkart.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oneplus 11");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		String ratings = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]")).getText();
		System.out.println(ratings);

		Thread.sleep(2000);
		driver.quit();

	}
}
