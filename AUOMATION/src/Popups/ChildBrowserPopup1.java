package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(6000);
		
		//1. getWindowHandle()
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
		//2. getWindowHandles
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		System.out.println(al.get(0));//id of main page
		System.out.println(al.get(1));//id of child page
		
		//child page
		driver.switchTo().window(al.get(1));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(4000);
		
		//parent page
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@name='home']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
