package TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import common.ConfigManager;


public class LoginTestCases  extends BaseTestCase{
	
	@Test
	public void verifyLoginFunctionality() throws InterruptedException
	{
		BaseTestCase.test.log(Status.INFO, "verify Login");

		inboxPage=loginPage.logintoApp(ConfigManager.getProp().getProperty("username"), ConfigManager.getProp().getProperty("password"));
				
	}

}
