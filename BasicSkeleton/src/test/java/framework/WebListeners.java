package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import com.aventstack.extentreports.Status;

import reusables.GenericMethod;

public class WebListeners extends AbstractWebDriverEventListener  {


	public void afterClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("After clicked"+element);
		  ExtentReportListeners.getReporter().log(Status.INFO, "After clicked"+element);
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Element : "+element +" for which  Value is entered " + keysToSend);
		  ExtentReportListeners.getReporter().log(Status.INFO, "Element : "+element +" for which  Value is entered " + keysToSend);
	}


	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to URL : "+url );
		  ExtentReportListeners.getReporter().log(Status.INFO, "Navigated to URL : "+url );
	}
	
	// For below . is used for relative path, it shld be appended inorder to achieve relative path.
	public void onException(Throwable throwable, WebDriver driver) {
		  ExtentReportListeners.getReporter().log(Status.FAIL,throwable.getMessage() + ", /n "+ throwable.getLocalizedMessage() );
		  ExtentReportListeners.getReporter().addScreenCaptureFromPath("."+GenericMethod.getScreenshotPath(driver,ExtentReportListeners.getReporter().getModel().getFullName()));
		  driver.quit();
	  }


}
