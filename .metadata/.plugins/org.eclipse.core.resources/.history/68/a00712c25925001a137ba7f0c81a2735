package tafe;
/*package com.carmax.sputnik.tafe.utils;*/

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/*import com.carmax.tafe.apiutils.RestUtilities;
import com.carmax.tafe.calculateobjects.Calculate.CalculateRequest;
import com.carmax.tafe.calculateobjects.Calculate.CalculateResponse;
import com.carmax.devops.connectors.database.DataGrabber;
import com.carmax.devops.infra.BrowserStackAPI;
import com.carmax.devops.infra.DriverFactory;
import com.carmax.devops.infra.alm.ALM_Connection;
import com.carmax.devops.reporting.ExtentManager;
import com.carmax.devops.reporting.ExtentTestManager;
import com.carmax.devops.reporting.ReportLog;
import com.carmax.devops.selenium.DriverUtils;
import com.carmax.devops.utils.BaseUtils;
import com.carmax.devops.utils.Configuration;
import com.carmax.devops.utils.SendMail;
//import com.carmax.sputnik.example.page.classes.LoginPage;
import com.carmax.tafe.getinputobjects.Getinputs;
import com.carmax.tafe.getinputobjects.Getinputs.InputRequest;
import com.carmax.tafe.getinputobjects.Getinputs.InputResponse;*/

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import tafe.Calculate.CalculateRequest;
import tafe.Calculate.CalculateResponse;

public class Suite_Base {

	////////// Driver//////////

	protected WebDriver driver;
	///////////////////////////

	////////// Extent Reports//////////
	/////////////////////////////////

	////////// Static Variables//////////
	protected static String almDomain;
	protected static String almProject;
	protected static String almTestSetID;
	protected static String almUserID;
	protected static String almPassword;
	protected static String runTestAsUser;

	protected static boolean sendEmailOnlyOnFailure;
	protected static boolean sendEmail;
	private static String emailSubject;
	private static String receiverEmails;
	private static String buildNumber;
	private static String buildName;
	public static String isRemote;
	public static String configFilePath;
	public static String reportPath;
	public static String projectName;
	protected static String tafe_apiKey;
	protected static String tafe_baseURI;
	protected static String tafe_basePath;
	protected static String tafe_userId;
	protected static String tafe_password;
	//////////////////////////////////////

	////////// Non-static Variables//////////
	protected String almTestID;
	protected String methodName;
	public String testScreenShotDirectory;
	protected String email;
	protected String password;
	///////////////////////////////////

	////////// Stopwatch / Timers//////////
	private LocalTime startTime;
	private LocalTime endTime;
	////////////////////////////////////

	////////// Class Declarations//////////
//	protected LoginPage loginPage;
	// protected AppFunctions appFunctions;
	////////////////////////////////////////

	protected static RequestSpecification getSpec;
	protected static ResponseSpecification resSpec;
	protected static RequestSpecification postSpec;
	
	

	protected CalculateRequest calculateRequest;
	protected CalculateResponse calculateResponse;

	@BeforeSuite(alwaysRun = true)
	public void preSuite() throws IOException {
		/*baseSuite = new BaseUtils();

		configFilePath = System.getProperty("user.dir") + "\\config.properties";
		configuration = new Configuration(configFilePath);
		configuration.checkForPropertiesFile();
		isRemote = configuration.readProperty("isRemote");
		almDomain = configuration.readProperty("almDomain");
		almProject = configuration.readProperty("almProject");
		almTestSetID = configuration.readProperty("test_set_id");
		almUserID = configuration.readProperty("almUserID");
		almPassword = configuration.readProperty("almPassword");
		runTestAsUser = configuration.readProperty("runTestAsUser");
		projectName = configuration.readProperty("project_name");
		tafe_apiKey = configuration.readProperty("tafe_apiKey");
		tafe_baseURI = configuration.readProperty("tafe_baseURI");
		tafe_basePath = configuration.readProperty("tafe_basePath");
		tafe_userId = configuration.readProperty("tafe_userId");
		tafe_password = configuration.readProperty("tafe_password");

		baseSuite.reportPathSetUp_defined(
				"\\\\fsiscr01\\fs_atlqashared\\Automated_Testing\\projects\\" + projectName + "\\Reports");
		reportPath = baseSuite.getReportPath();

		Runtime.getRuntime().exec("taskkill /f /t /im chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumServer\\chromedriver.exe");

		if (isRemote.equalsIgnoreCase("Y")) {
			ExtentManager.createInstance(reportPath, projectName, true);
			baseSuite.setProxy("pac.carmax.org", 8080);
		} else {
			ExtentManager.createInstance(reportPath, projectName, false);
			// baseSuite.setProxy("pitbcproxy.carmax.org", 8080);
		}
		ExtentTestManager.setReporter(ExtentManager.getInstance());*/

	}

	@Parameters({ "os", "os_version", "browser", "browser_version", "device", "resolution" })
	@BeforeMethod(alwaysRun = true)
	public void beforeTestMethod(Method method, @Optional() String os, @Optional() String os_version,
			@Optional() String browser, @Optional() String browser_version, @Optional() String device,
			@Optional() String resolution) throws IOException {

		initializeClasses();
	}

	public void initializeClasses() {
		/*restUtilities = new RestUtilities(tafe_apiKey, tafe_userId, tafe_password, tafe_baseURI, tafe_basePath);
		//getSpec = restUtilities.getRequestSpecification();
		postSpec = restUtilities.postRequestSpecification();
		resSpec = restUtilities.getResponseSpecification();
		inputRequest = new InputRequest();
		inputResponse = new InputResponse();*/
		calculateRequest = new CalculateRequest();
		calculateResponse = new CalculateResponse();
	/*	testUtils = new TestUtils(test);*/
	}

	/*public void takeScreenshot() {
		baseTest.takeScreenshot(test, driverFactory, methodName, reportPath);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult testResult) {
		endTime = LocalTime.now();
		long runTime = Duration.between(startTime, endTime).getSeconds();
		alm = new ALM_Connection(extentManager, almDomain, almProject, almUserID, almPassword, runTestAsUser,
				almTestSetID, almTestID, runTime, ExtentManager.getExtentReportLocation());
		baseTest.tearDown(testResult, alm, driverFactory, test, extentManager, methodName, reportPath);
	}*/

	/*@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		baseSuite.afterSuite();

		emailSubject = "Automated Test Failure";
		SendMail send = new SendMail();
		if (sendEmail) {
			if (sendEmailOnlyOnFailure && baseSuite.getNumOfFailures() > 0)
				send.sendMessage("benjamin_e_marcuson@carmax.com", receiverEmails, emailSubject,
						"Report path:<br>" + reportPath + "\\Report.html");
			else if (!sendEmailOnlyOnFailure)
				send.sendMessage("benjamin_e_marcuson@carmax.com", receiverEmails, emailSubject,
						"Report path:<br>" + reportPath + "\\Report.html");
		}
	}*/
}
