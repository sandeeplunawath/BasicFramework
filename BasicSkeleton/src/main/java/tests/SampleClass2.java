package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import framework.ExtentReportListeners;
import framework.TestBase;
import framework.TestBase;
import reusables.AssertMethods;
import reusables.GenericMethod;


public class SampleClass2  extends TestBase  {


	@Test
	public void two_W3SchoolsestMethod1()
	{
		WebDriver driver = getDriver();
		//driver.navigate().to("https://www.w3schools.com/html/");  

				//driver.manage().window().maximize();  

		GenericMethod.Click(driver,By.linkText("CSS"));
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		GenericMethod.Click(driver,By.linkText("SQL"));
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		GenericMethod.Click(driver,By.linkText("PHP"));
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
		driver.quit();
	}
	@Test
	public void two_W3SchoolsestMethod2()
	{
		WebDriver driver = getDriver();
		//driver.navigate().to("https://www.w3schools.com/html/");  

				//driver.manage().window().maximize();  

		GenericMethod.Click(driver,By.linkText("CSS"));
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		GenericMethod.Click(driver,By.linkText("SQL"));
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		GenericMethod.Click(driver,By.linkText("PHP"));
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
		driver.quit();
	}

}
