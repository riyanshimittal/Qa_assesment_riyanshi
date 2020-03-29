package PageFunctions;

import org.openqa.selenium.WebDriver;

import objectrepository.InboxOR;

public class InboxFunctions extends InboxOR {
	WebDriver driver=null;

	public InboxFunctions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
 public String validateInboxTitle() throws InterruptedException {
		 
	     Thread.sleep(2000);
	     String urltraced= driver.getCurrentUrl();
	     System.out.println("Url : "+urltraced);
	     return urltraced;
		 
	 }


}
