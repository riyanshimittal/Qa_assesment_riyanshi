package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.ConfigManager;
import junit.framework.Assert;


public class InboxTestCase extends BaseTestCase{
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	
		inboxPage=loginPage.logintoApp(ConfigManager.getProp().getProperty("username"), ConfigManager.getProp().getProperty("password"));

	}
	@Test
	public void CheckTitle() throws InterruptedException {
		String title1 = inboxPage.validateInboxTitle();
		Assert.assertEquals(title1,"https://mail.google.com/mail/u/0/#inbox");
		
	}
	
	

}
