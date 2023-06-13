package DDF_POM_TestNG_BaseClass_Utility;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Log4jExample {
	  private static Logger logger = Logger.getLogger(Log4jExample.class);

  @Test
  public void TC1(){
	    PropertyConfigurator.configure("log4j.properties");

    System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\March2023\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(option);//upcasting

    logger.debug("Starting test");
    driver.get("https://www.google.com/");
    logger.info("Opened Google website");
    String title = driver.getTitle();
    logger.debug("Page title: " + title);
    if (title.equals("Google")) {
      logger.info("Title is correct");
    } else {
      logger.error("Title is incorrect");
    }
    driver.quit();
    logger.debug("Test complete");
  }
}
