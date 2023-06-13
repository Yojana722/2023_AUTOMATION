package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_isMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);
		
		//step 1: identify list box
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		//step 2:
		Select s = new Select(day);
		
		if(s.isMultiple()) {
			System.out.println("List box is multi-selectable");
		}else {
			System.out.println("List box is single selectable");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
