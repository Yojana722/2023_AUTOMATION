package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");// to open flipkart

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();// to handle auto papoup
		Thread.sleep(2000);

		WebElement HOME = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));// path of home

		Actions act = new Actions(driver);
		act.moveToElement(HOME).perform();// to move element on home

		WebElement HomeDecor = driver.findElement(By.linkText("Home Decor"));// path of home decor
		Actions act1 = new Actions(driver);
		act1.moveToElement(HomeDecor).perform();// to move element on home decor

		Thread.sleep(2000);

		WebElement WallDecor = driver.findElement(By.linkText("Wall Decor"));// path of wall decor
		Actions act2 = new Actions(driver);
		act2.moveToElement(WallDecor).click().perform();// To move element on wall decor
		Thread.sleep(2000);

	}
}
