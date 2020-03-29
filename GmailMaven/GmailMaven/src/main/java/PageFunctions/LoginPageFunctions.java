
package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import com.aventstack.extentreports.Status;

import TestCases.BaseTestCase;
import common.Driverfun;
import objectrepository.LoginPageOR;

public class LoginPageFunctions extends LoginPageOR{
	

	WebDriver driver=null;
    Driverfun driverFunc;

	public LoginPageFunctions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driverFunc = BaseTestCase.getDriverFun();
		if(!driver.getTitle().equalsIgnoreCase("Gmail")) {
			throw new SkipException("Not Gmail!");
		}
		
	}
	public InboxFunctions logintoApp(String username, String password) throws InterruptedException {
		BaseTestCase.test.log(Status.INFO, "inside LoginintoApp method");
		
		driverFunc.enterValues(usernameinput,username);
		driverFunc.click(nextBtn);
		Thread.sleep(2000);
		driverFunc.enterValues(passwordinput,password);
		driverFunc.click(submit);
	    return new InboxFunctions(driver);
	}
	
	

}
