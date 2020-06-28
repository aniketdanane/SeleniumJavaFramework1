package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings",true);
		WebDriver driver= new InternetExplorerDriver(caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).click();
		driver.close();
		driver.quit();
		
	}

}
