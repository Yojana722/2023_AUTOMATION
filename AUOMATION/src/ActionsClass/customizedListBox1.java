package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");

		//Handling notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
		Thread.sleep(4000);

		// step 1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		// step 2:
		Actions act = new Actions(driver);// keyboard can interact with browser with the help of Actions class

		act.click(month).perform();

		act.sendKeys(Keys.ARROW_DOWN).perform();

		act.sendKeys(Keys.ARROW_DOWN).perform();

		act.sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

		driver.quit();

	}
}
