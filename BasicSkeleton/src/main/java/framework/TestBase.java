package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class TestBase {
	private static ThreadLocal<EventFiringWebDriver> webDriverTest = new ThreadLocal<EventFiringWebDriver>();

	@BeforeMethod
	public void initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\Resources\\drivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  		
		EventFiringWebDriver event_driver = new EventFiringWebDriver(driver);
		WebListeners testListner = new WebListeners();
		event_driver.register(testListner);
		
		/*event_driver.navigate().to("https://www.w3schools.com/html/");  
		event_driver.manage().window().maximize();  */
		webDriverTest.set(event_driver);
		//extentReprter();
		
	}
	
	static ExtentReports extent;
	public static ExtentReports extentReprter()
	{

		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "\\src\\main\\reports\\index.html");
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sandeep");
		return extent;
	}

	public static WebDriver getDriver() {
		return webDriverTest.get();
	}
	
	
	
}
