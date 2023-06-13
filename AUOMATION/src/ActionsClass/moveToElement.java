package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//step 1:
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		//step 2:
		Actions act = new Actions(driver);
		
		//step 3:
		act.moveToElement(more).perform();
		Thread.sleep(1000);
		
		//contextClick - right click
		//act.contextClick(more).perform();
		
		//click - left click
		act.click(more).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
