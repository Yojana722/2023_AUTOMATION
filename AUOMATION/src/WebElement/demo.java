package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		String expResult = "iphone 14";

		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iPhone");
		Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

		for (WebElement option : alloptions) {
			String actResult = option.getText();
			
			if (actResult.equals(expResult)) {
				option.click();
				break;
			}
		}
		//Thread.sleep(2000);
		//driver.quit();
	}
}
