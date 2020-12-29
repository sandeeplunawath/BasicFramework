package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class TestBase {
	private static ThreadLocal<EventFiringWebDriver> webDriverTest = new ThreadLocal<EventFiringWebDriver>();

	@BeforeMethod
	@Parameters({"browserType"})
	public void initializeDriver(String browserType)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\Resources\\drivers\\chromedriver.exe");  
		System.out.println("initialize one :- "+browserType);

		//headless configuration
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");	
		WebDriver driver=new ChromeDriver(options);  
		System.out.println("Headless chrome browser execution");

		//WebDriver driver=new ChromeDriver();  
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
