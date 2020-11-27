package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import framework.ExtentReportListeners;
import framework.TestBase;
import reusables.AssertMethods;
import reusables.GenericMethod;


public class SampleClass_SameURL1  extends TestBase  {

	//WebDriver driver = getDriver();
	

	//@Test
	public void W3SchoolsestMethod_URL1()
	{
		TestBase.getDriver().findElement(By.linkText("CSS")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		TestBase.getDriver().findElement(By.linkText("SQL")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		getDriver().findElement(By.linkText("PHP")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
		
	}
	
	@Test
	public void Method2_URL1()
	{
		getDriver().findElement(By.linkText("CSS")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		getDriver().findElement(By.linkText("SQL")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		getDriver().findElement(By.linkText("PHP")).click();
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
		
	}
	
	@AfterClass
	public void cleanUp()
	{
		getDriver().quit();
	}

}
