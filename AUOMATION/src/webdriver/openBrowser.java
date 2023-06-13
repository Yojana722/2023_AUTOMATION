package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//4. maximize()
		driver.manage().window().maximize();
		
		//1. get() - used to open url
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		
		//5. minimize()
		driver.manage().window().minimize();
		
		//2. close() - this will close single window
		//driver.close();
		
		//3. quit() - this will close multiple windows
		driver.quit();
	}
}
