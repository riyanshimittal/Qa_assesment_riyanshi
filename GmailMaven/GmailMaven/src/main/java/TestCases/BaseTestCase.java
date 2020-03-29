package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PageFunctions.InboxFunctions;
import PageFunctions.LoginPageFunctions;
import common.ConfigManager;
import common.Driverfun;
import common.StartDriver;


public class BaseTestCase {
	StartDriver s;
	static Driverfun driverFun;
	public ExtentHtmlReporter html;
	public static ExtentReports report;
	public static ExtentTest classtest;
	public static ExtentTest test;
	
	public static String reportPath;
	
	
	public static Driverfun getDriverFun() {
		return driverFun;
	}

	private void setDriverFun(Driverfun driverFun) {
		this.driverFun = driverFun;
	}

	protected LoginPageFunctions loginPage;
	protected InboxFunctions inboxPage;
	
	@BeforeSuite
	public void beforesuit() {
		String currentDirectory = System.getProperty("user.dir");
		SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy(HH_mm_ss)");
	    reportPath=currentDirectory+"/"+formatter.format(new Date());
		Path p = Paths.get(reportPath);
	     try {
			Files.createDirectories(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		html = new ExtentHtmlReporter(reportPath+"/"+"report.html");
		report = new ExtentReports();
		report.attachReporter(html);
		
	}
	
	
	@BeforeTest
	public void beforeTest() {
		try {
			ConfigManager.loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browser = ConfigManager.getProp().getProperty("browser");
		s = new StartDriver();
		s.startDriver(browser);
		s.getDriver();
		driverFun = new Driverfun(s.getDriver());
		setDriverFun(driverFun);
		loginPage = new LoginPageFunctions(s.getDriver());
	}
	
	@BeforeMethod
	public void beforMethod(Method method) {
		test=classtest.createNode(method.getName());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getMethod().getMethodName()+"has failed");
			String pa = driverFun.captureScreenshot(s.getDriver());
			classtest.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(pa).build());
		}
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getMethod().getMethodName()+"has passed");
		}
		if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, result.getMethod().getMethodName()+"has skipped");
		}
	}
	
	@AfterTest
	public void afterTest() {
		report.flush();
		s.getDriver().quit();
	}
	


}
