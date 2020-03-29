package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxOR {
	private WebDriver driver;
	
	 public InboxOR(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath ="//title")
	 protected WebElement inboxtitle;
	 

}
