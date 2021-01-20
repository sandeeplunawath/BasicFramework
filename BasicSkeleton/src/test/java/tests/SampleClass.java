package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import framework.ExtentReportListeners;
import framework.TestBase;
import framework.TestBase;
import reusables.AssertMethods;
import reusables.GenericMethod;


public class SampleClass  extends TestBase  {


	/*@Test
	public void ZoomMethod2()
	{
		WebDriver driver = getDriver();
		driver.navigate().to("https://zoom.us/");  

		driver.manage().window().maximize();  

		GenericMethod.Click(driver(), By.linkText("JOIN A MEETING"));

		ExtentReportListeners.getReporter().log(Status.INFO, "Join a test meeting");
		GenericMethod.Click(driver(), By.linkText("SIGN IN"));
		ExtentReportListeners.getReporter().log(Status.INFO, "sign in");		

		GenericMethod.Click(driver(),By.linkText("Plans & Pkkkkkkkkkkkkkkkkkkkkricing"));

		ExtentReportListeners.getReporter().log(Status.INFO, "Plandddddddddddddddddddds & Pricing");
		GenericMethod.Click(driver(),By.linkText("Contact Sales"));
		ExtentReportListeners.getReporter().log(Status.INFO, "Contact Sales");

		AssertMethods.AssertTrue("hell0", "hell0", "Verifying two feilds");
		driver.quit();
	}
*/
	@Test(dataProvider="SearchProvider")
	public void one_W3SchoolsestMethod1(String author,String searchKey)
	{
		if(author.equals("Guru99"))
			throw new SkipException("Skipping this exception");
		System.out.println("DP :"+ author);
		System.out.println("DP :"+ searchKey);
		GenericMethod.Click(driver(),By.linkText("CSS"));
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		GenericMethod.Click(driver(),By.linkText("SQL"));
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		GenericMethod.Click(driver(),By.linkText("PHP"));
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
	}
	@Test
	public void one_W3SchoolsestMethod2(String author,String searchKey)
	{
		
		GenericMethod.Click(driver(),By.linkText("CSS"));
		ExtentReportListeners.getReporter().log(Status.INFO, "css");		
		GenericMethod.Click(driver(),By.linkText("SQL"));
		ExtentReportListeners.getReporter().log(Status.INFO, "sql");		
		GenericMethod.Click(driver(),By.linkText("PHP"));
		ExtentReportListeners.getReporter().log(Status.INFO, "php");		
		AssertMethods.AssertTrue("two", "two", "Verifying two feilds");
	}
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataprovider(){
		return new Object[][] 
				{
			{ "Guru99", "India" },
			{ "Krishna", "UK" },
			{ "Bhupesh", "USA" }
				};

	}
}
