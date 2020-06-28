package test;

import org.openqa.selenium.By;
import pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	 static WebDriver driver= null;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();	
		driver.get("https://google.com");
		GoogleSearchPage.textboxSearch(driver).sendKeys("Automation");
		GoogleSearchPage.button(driver).click();		
		
	}
	

	
	

}
