package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    //Alert popup
	    Alert alt = driver.switchTo().alert();
	    
	    //getText()
	    System.out.println(alt.getText());//Do you really want to delete this Customer?
	    
	    alt.accept();//OK button
	    
	   //alt.dismiss();//Cancel button
	    
	    Alert alt1 = driver.switchTo().alert();
	    System.out.println(alt1.getText());//Customer Successfully Delete!
	    
	    alt1.accept();
	    
	    Thread.sleep(2000);
	    driver.quit();
	    }
}
