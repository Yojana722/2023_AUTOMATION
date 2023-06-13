package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		//1. sendKeys
		email.sendKeys("qa@gmail.com");
		Thread.sleep(1000);

		//2. clear
		email.clear();

		email.sendKeys("qa@gmail.com");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567890");

		//4. getText
		WebElement pass = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		System.out.println(pass.getText());//Forgotten password?
		
		//3. click
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}
