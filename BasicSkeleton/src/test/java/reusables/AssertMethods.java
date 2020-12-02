package reusables;

import com.aventstack.extentreports.Status;

import framework.ExtentReportListeners;

public class AssertMethods
{

	public static void AssertTrue(String actualValue, String expectedValue, String Description)
	{
		if(actualValue.equals(expectedValue))
		{
			System.out.println("Values are equal");
			  System.out.println(
				       Thread.currentThread().getStackTrace()[2].getMethodName()); // output : main
			  ExtentReportListeners.getReporter().log(Status.INFO, actualValue);
			
		 
		}
		
	}
}
