package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 4. maximize()
		driver.manage().window().maximize();

		// 1. get() - used to open url
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);//C:\Users\DELL\AppData\Local\Temp\screenshot4016077900993459979.png

		String random = RandomString.make(4);
		File dest = new File("E:\\Yojana\\new\\March2023\\Screenshots\\facebook"+random+".jpeg");
		
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
