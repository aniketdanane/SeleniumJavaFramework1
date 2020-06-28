package test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
@Test
public void test1() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("automation");	
	driver.findElement(By.name("btnK")).click();
	
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	  .withTimeout(Duration.ofSeconds(15))
	  .pollingEvery(Duration.ofSeconds(5))
	  .ignoring(NoSuchElementException.class);

	WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	  public WebElement apply(WebDriver driver) {
		  
		  WebElement linkelement= driver.findElement(By.xpath("//*[@id='rso']/div[4]/div/div[1]/a/h3"));
		  
	    return linkelement;
	    }
	});
	element.click();
	
	System.out.println("I am inside test1");
	
	
}
	

	
}
