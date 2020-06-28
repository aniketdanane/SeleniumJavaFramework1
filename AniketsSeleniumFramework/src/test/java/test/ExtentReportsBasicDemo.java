package test;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extentTest;
	WebDriver driver;
	

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		

	}

}
