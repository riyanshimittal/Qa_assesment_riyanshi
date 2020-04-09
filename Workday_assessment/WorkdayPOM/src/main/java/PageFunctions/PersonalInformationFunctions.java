package PageFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import objectrepository.PersonalInfoOR;
import TestCases.BaseTestCase;
import common.DriverFun;

public class PersonalInformationFunctions {
	
	private static final WebElement PinfoTab = null;
	private static final WebElement PinfoLink = null;
	WebDriver driver=null;
    DriverFun driverFunc;

	public PersonalInformationFunctions(WebDriver driver) {
		super();
		this.driver = driver;
		driverFunc = BaseTestCase.getDriverFun();
	}

	public PersonalDetailsFunctions intoDetails() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		Thread.sleep(20000);
	    driverFunc.waitTime(PinfoTab);	
		driverFunc.click(PinfoTab);
		//Thread.sleep(20000);
		driverFunc.waitTime(PinfoLink);	
		driverFunc.click(PinfoLink);
		return new PersonalDetailsFunctions(driver);
	}

}
