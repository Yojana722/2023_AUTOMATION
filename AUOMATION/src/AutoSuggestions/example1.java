package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		String expResult = "redmi note 12 pro";
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.google.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);

		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

		for (WebElement option : allOptions) {
			String actResult = option.getText();
           // System.out.println(option.getText());//for printing all options
			if (actResult.equals(expResult)) {
				option.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.quit();

	}
}
