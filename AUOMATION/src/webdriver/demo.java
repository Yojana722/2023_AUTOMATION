package webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");

		driver.manage().window().maximize();

		List<WebElement> allcity = driver.findElements(By.xpath("//select[@name='fromPort']//option"));

		for (WebElement city : allcity) {
			if (city.getText().equals("Boston")) {
				city.click();
				break;
			}
		}

		List<WebElement> destcity = driver.findElements(By.xpath("//select[@name='toPort']//option"));

		for (WebElement dcity : destcity) {
			if (dcity.getText().equals("London")) {
				dcity.click();
				break;
			}

		}

		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

		// find the lowest price

		List<WebElement> allrow = driver.findElements(By.xpath("//table[@class='table']//tr"));

		// List<WebElement>allcol=driver.findElements(By.xpath("//table[@class='table']//th"));

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int r = 1; r < allrow.size(); r++) {

			String price = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
			System.out.println(price);

			String newprice = price.replace("$", "");

			Double pri = Double.parseDouble(newprice);

			int intprice = pri.intValue();

			array.add(intprice);

		}

		for (int i = 1; i <= array.size(); i++) {
			if (array.get(i) == Collections.min(array))

			{
				driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[1]//input")).click();
				break;
			}
		}


		Thread.sleep(5000);
		driver.quit();

	}
}
