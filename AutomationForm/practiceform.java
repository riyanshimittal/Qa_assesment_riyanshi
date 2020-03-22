package test;

//import java.time.Duration;
//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiceform {
     static WebDriver driver;
      public static void main(String[] args) {
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\riyanshi.mittal\\Downloads\\chromedriver_win32\\chromedriver.exe");
           System.setProperty("webdriver.chrome.silentOutput", "true");
           driver = new ChromeDriver();
           driver.get("https://www.toolsqa.com/automation-practice-form/");
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           
           driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
           
           //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3))
           //.pollingEvery(Duration.ofMillis(3)).ignoring(NoSuchElementException.class);
          
          
          //WebElement foo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")));
          //foo.click();
           
         WebDriverWait wait=new WebDriverWait(driver,60);
         // WebElement cross=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")));
         // cross.click();
           driver.findElement(By.linkText("Partial Link Test")).click();
           System.out.println("Partial Link Test Checked");
           
          driver.findElement(By.linkText("Link Test")).click();
           System.out.println("Link Test Checked");
           driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
           
           driver.findElement(By.name("firstname")).sendKeys("Riyanshi");
           driver.findElement(By.id("lastname")).sendKeys("Mittal");    
           driver.findElement(By.id("buttonwithclass")).click();
           
           System.out.println("Button after last name clicked");
           
          // WebElement male_radio0 = driver.findElement(By.id("sex-0"));
           
           WebElement female_radio1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sex-1")));
           female_radio1.click();
           System.out.println("Radio button clicked? "+female_radio1.isSelected());
           System.out.println("Female radio Button clicked");
           WebElement exp0 = driver.findElement(By.id("exp-0"));   
           exp0.click();
           System.out.println("Radio button clicked? "+exp0.isSelected());
           
           WebElement datepicker= driver.findElement(By.id("datepicker")); 
           datepicker.sendKeys("15 feb 2020");
           System.out.println("Datepicker Checked");
           WebElement profession1= driver.findElement(By.id("profession-1"));
           profession1.click();
           System.out.println("Profession Checked");

           WebElement upload= driver.findElement(By.id("photo"));
           upload.sendKeys("C:\\Users\\riyanshi.mittal\\Desktop\\hi.png");
           System.out.println("Photo uploaded");

           WebElement linktext = driver.findElement(By.linkText("Selenium Automation Hybrid Framework"));
           linktext.click();
           WebElement linktext1 = driver.findElement(By.linkText("Test File to Download"));
           linktext1.click();
           System.out.println("Download Checked");
           
            driver.findElement(By.id("tool-1")).click(); 

            Select dropdown = new Select(driver.findElement(By.id("continents")));
            dropdown.selectByVisibleText("Europe");
            System.out.println("Dropdown Checked");

            Select dropdownMultiple = new Select(driver.findElement(By.id("continentsmultiple")));
            dropdownMultiple.selectByVisibleText("Asia");
            dropdownMultiple.selectByIndex(2);
            System.out.println("Dropdown Checked");

            Select seleniumcmds = new Select(driver.findElement(By.id("selenium_commands")));
            seleniumcmds.selectByVisibleText("Navigation Commands");
            seleniumcmds.selectByIndex(2);
            
            driver.findElement(By.id("submit")).click();
            System.out.println("Submit Checked");
         

      }

}

