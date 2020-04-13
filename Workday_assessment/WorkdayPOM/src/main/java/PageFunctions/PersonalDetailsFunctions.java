package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import objectrepository.PersonalDetailsOR;
import TestCases.BaseTestCase;
import common.DriverFun;
import junit.framework.Assert;

public class PersonalDetailsFunctions {

	private static final WebElement TitleName = null;
	WebDriver driver=null;
    DriverFun driverFunc;
    BaseTestCase btc;
	public PersonalDetailsFunctions(WebDriver driver) {
		super();
		this.driver = driver;
		driverFunc = BaseTestCase.getDriverFun();
		// TODO Auto-generated constructor stub
	}
	
	  	public void Details(String text) throws InterruptedException {
		Thread.sleep(30000);
        WebElement link1 = null;
		//2 extras here
        if(link1.isDisplayed()) {
        	 driverFunc.click(link1);
             WebElement revise = null;
			driverFunc.waitTime(revise);	
             driverFunc.click(revise);
             Thread.sleep(2000);
             WebElement header = null;
			System.out.println("Name is "+header.getText());
             Assert.assertTrue(isTitleMatched());
      		System.out.println("Aseert executed");
             Thread.sleep(20000);
             WebElement textarea = null;
			driverFunc.scroll(textarea);
     		 driverFunc.enterValues(textarea, text);
     		WebElement save = null;
			driverFunc.click(save);
        }
	}

		public boolean isTitleMatched() {
			
			if(TitleName.getText().equalsIgnoreCase("Riyanshi Mittal")) {
			 return true;
			}
			else {
			return false;
			}
		}
}
