package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4_MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("file:///E:/Yojana/new/March2023/HTML/ListBox_MultiSelectable.html");

		Thread.sleep(2000);
		
		//step 1:
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));	
		
		//step 2:
		Select s = new Select(country);
		
		//step 3:
		s.selectByIndex(0);
		
		Thread.sleep(1000);
		
		s.selectByValue("5");
		
		Thread.sleep(1000);
		
		s.selectByVisibleText("USA");
		
		System.out.println(s.getFirstSelectedOption().getText());//India
		
		List<WebElement> allOptions = s.getAllSelectedOptions();//India, NewYork, USA
		System.out.println(allOptions.size());
		
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		
		s.deselectByIndex(0);
		s.deselectByValue("5");
		s.deselectByVisibleText("USA");
		
	
		//s.deselectAll();
		
		List<WebElement> allOptions1 = s.getAllSelectedOptions();
		System.out.println(allOptions1.size());//0

		Thread.sleep(2000);
		driver.quit();
	}
}
