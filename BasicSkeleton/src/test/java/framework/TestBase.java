package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
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
		driver.get("https://www.w3schools.com/html/");  
		driver.manage().window().maximize();  
		EventFiringWebDriver event_driver = new EventFiringWebDriver(driver);
		WebListeners testListner = new WebListeners();
		event_driver.register(testListner);
		webDriverTest.set(event_driver);
	}
	
	static ExtentReports extent;
	public static ExtentReports extentReprter()
	{

		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/index.html");
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sandeep");
		return extent;
	}

	public static WebDriver driver() {
		return webDriverTest.get();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver().quit();
	}
}
