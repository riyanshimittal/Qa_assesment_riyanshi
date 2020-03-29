package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOR {
	private WebDriver driver;
	
	 public LoginPageOR(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath ="//title")
	  protected WebElement title;

	 @FindBy(id="identifierId")
	  protected WebElement usernameinput;
	
	 @FindBy(id="identifierNext")
	protected  WebElement nextBtn;
	
	 
	 @FindBy(xpath="//input[@type='password']")
	 protected WebElement passwordinput;
	 
	 @FindBy(id="passwordNext")
    protected WebElement submit;
	 
	  

}
