package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) throws InterruptedException
	{
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			Thread.sleep(4000);	
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			Thread.sleep(4000);	
		}
		
	}

	@Test
	public void test1() {

		driver.get("https://google.com");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
