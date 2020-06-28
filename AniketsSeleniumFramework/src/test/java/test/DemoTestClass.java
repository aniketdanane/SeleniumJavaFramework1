package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class DemoTestClass {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extentTest;
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		htmlReporter= new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.setSystemInfo("organization","lets do it");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	
		}
	@AfterClass
	public void afterClass() {
		driver.quit();
		extent.flush();
	}

	
	@Test
	public void testSuccessful() {
	driver.get("https://google.com");	
	extentTest= extent.createTest("Successful test");
	extentTest.log(Status.PASS, "Test Method successful");
	
	}
	
	@Test
	public void testFail() {
	driver.get("https://yahoo.com");	
	extentTest= extent.createTest("Failed test");
	extentTest.pass("passed");
	extentTest.log(Status.FAIL, "Test Method failed");
	Assert.fail("Executing Failed Test Method");
	
	
	}
	
	@Test
	public void testSkip() {
	driver.get("https://facebook.com");	
	extentTest= extent.createTest("Skipped test");
	extentTest.log(Status.SKIP, "Test Method skipped");
	throw new SkipException("Executing skipped Test Method");
	}

	@AfterMethod
	public void afterMethod() {
	}

	

	
}
