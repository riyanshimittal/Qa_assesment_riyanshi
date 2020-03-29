package common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.BaseTestCase;

public class Driverfun {
	private WebDriver driver=null;

	public Driverfun(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void enterValues(WebElement ele, String value) {
		try {
		ele.sendKeys(value);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void click(WebElement ele) {
		try {
			ele.click();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public WebElement findElement(String identifies, String value) {
		WebElement ele=null;
		return ele;
	}
	
	public String captureScreenshot(WebDriver driver) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = "";
        try {
            // now copy the screenshot to desired location using copyFile //method
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
            String stringDate = dateFormat.format(new Date());
            String saveLocation =BaseTestCase.reportPath + ".png";
            fileName =
                    saveLocation.replace(
                            System.getProperty("user.dir") + File.separator + File.separator,
                            "");
            FileUtils.copyFile(src, new File(saveLocation));
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return fileName;
    }

}
