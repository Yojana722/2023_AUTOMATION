package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_setPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 8. navigate().to("") - used to open url
		driver.navigate().to("https://www.selenium.dev/downloads/");

		Thread.sleep(2000);
		
		//9. setSize
		Dimension d = new Dimension(700, 900);//width, height
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		
		//10. setPosition
		Point p = new Point(900, 500);//x,y coordinates
		driver.manage().window().setPosition(p);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
