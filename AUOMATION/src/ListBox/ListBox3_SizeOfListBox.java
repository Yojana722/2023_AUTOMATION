package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3_SizeOfListBox {

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
		
		List<WebElement> allOptions = s.getOptions();
		int size = allOptions.size();//31
		System.out.println(size);
		
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
