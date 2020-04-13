package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import common.ConfigManager;

public class PersonalDetailsTest extends BaseTestCase {
	@BeforeMethod
	public void Login() throws InterruptedException {

		Pinfo = loginPage.login(ConfigManager.getProp().getProperty("username"),ConfigManager.getProp().getProperty("password"));
		Pdetails = Pinfo.intoDetails();
	}

	@Test
	public void VerifyDetailsandComment() throws InterruptedException{
		logger = report.createTest("Details Verify");
		Pdetails.Details("Demo comment");
		logger.pass("All verified");
		logger.log(Status.INFO, "verified!!");

	}
	

}
