import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
String str= System.getProperty("user.dir");
System.out.println(str);

WebDriver driver = new ChromeDriver();
driver.get("https://google.com");
driver.quit();
		
	}

}
