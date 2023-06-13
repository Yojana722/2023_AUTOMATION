package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(logIn).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
