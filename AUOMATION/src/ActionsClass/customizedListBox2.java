package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox2 {

	public static void main(String[] args) throws InterruptedException {
		String expResult = "Dec";
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
		Thread.sleep(4000);
		
		//step 1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2:
		Actions act = new Actions(driver);//keyboard can interact with browser with the help of Actions class
		
		//findElements -> List<WebElement>
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		System.out.println(allOptions.size());//12
		
		for(int i=0; i<=allOptions.size()-1; i++) {
			String actResult = allOptions.get(i).getText();
			
			if(actResult.equals(expResult)) {
				allOptions.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
