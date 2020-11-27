package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import framework.ExtentReportListeners;
import framework.TestBase;
import reusables.AssertMethods;
import reusables.GenericMethod;


public class SampleClass_SameURL2  extends TestBase  {

	WebDriver driver = getDriver();
	

	@Test
	public void W3SchoolsestMethod()
	{
		driver.findElement(By.linkText("CSS")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		driver.findElement(By.linkText("SQL")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		driver.findElement(By.linkText("PHP")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
		
	}
	
	@Test
	public void W3SchoolsestMethod2()
	{
		driver.findElement(By.linkText("CSS")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		driver.findElement(By.linkText("SQL")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		driver.findElement(By.linkText("PHP")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
		
	}
	@AfterClass
	public void cleanUp()
	{
		driver.quit();
	}
}
