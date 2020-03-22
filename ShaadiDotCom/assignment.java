package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment {
	static  WebDriver driver;
	
    public static void main(String[] args) throws Exception 
    
    {
      System.setProperty("webdriver.chrome.driver","C:/Users/riyanshi.mittal/Downloads/chromedriver_win32/chromedriver.exe");
      System.setProperty("webdriver.chrome.silentOutput", "true");
      driver = new ChromeDriver();
      
      //Site Opening
      driver.get("https://www.shaadi.com/");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
      System.out.print("site open\n");
      
      //Maximizing
      driver.manage().window().maximize();
      System.out.print("maximized \n");
      
      //Sign up for free
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[1]/div[1]/div[2]/a[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[2]/p/a")).click();
      
      //email box
      WebElement email = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
      Random randomGenerator = new Random();  
      int randomInt = randomGenerator.nextInt(1000);  
      email.sendKeys("username"+ randomInt +"@gmail.com");   
      System.out.println("eamil enterd is "+" value--> "+email.getAttribute("value"));
      
      //password
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[2]/div[2]/input")).sendKeys("hello");
      System.out.print("password done \n");
      
      //relation dropdown
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[2]/div[3]/div/div/div[2]/span")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[2]/div[3]/div/div[2]/div[4]")).click();
      System.out.print("relation dropdown done \n");
      
      //next click
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/button")).click();
      
      //fname
      WebElement fname = driver.findElement(By.xpath("//input[contains(@name,'first_name')]"));
      fname.click();
      fname.sendKeys("aman");
     
      //lname
      WebElement lname = driver.findElement(By.xpath("//input[contains(@name,'last_name')]"));
      lname.click();
      lname.sendKeys("jain"); 
      
      System.out.print("name entered \n");
      
      //day
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[1]/div/div")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[1]/div/div[2]/div[5]")).click();
      
      //month
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[2]/div/div")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[2]/div/div[2]/div[5]")).click();
     
      //year
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[3]/div/div")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[3]/div/div[2]/div[6]")).click();
      
      System.out.print("dob entered \n");
      
      //religion
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div[2]/div[4]")).click();
      System.out.print("religion entered \n");
      
      //mother-tongue
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div[2]/div[1]/div[6]")).click();
      System.out.print("mother toungue entered \n");
      
      //area
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div")).click();
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div[2]/div[1]/div[4]")).click();
      System.out.print("area entered \n");
      
      //register
      driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[7]/button")).click();
      
      //city
      WebElement city = driver.findElement(By.xpath("//input[@id='places']"));
      city.click();
      Thread.sleep(2000);
      city.sendKeys("Delhi, India");
      Thread.sleep(2000);
      city.sendKeys(Keys.CONTROL + "\t"); 
      Thread.sleep(2000);
      System.out.print("city entered \n");
            
      //liveswith
      driver.findElement(By.xpath("//*[@id=\"livesWithFamilyOption\"]/div[1]/label/div")).click();
      System.out.print("lives with entered \n");
      
      //maritial-status
      driver.findElement(By.xpath("//*[@id=\"maritalStatus\"]")).click();
      System.out.println("Clicked Marital Status");
      WebElement marital = driver.findElement(By.xpath("//input[@value='Never Married']"));
      marital.click();
      marital.sendKeys(Keys.CONTROL + "\t");
      System.out.print("marital status entered \n");

      
      //diet
      driver.findElement(By.xpath("//*[@id=\"diet\"]/div[1]/label")).click();
      System.out.print("diet entered");     
      WebDriverWait wait = new WebDriverWait(driver, 60);
      
      //height
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='height']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'4ft 7in - 139cm')]"))).click();
      System.out.print("hieght entered");
  
      //community
      WebElement c = driver.findElement(By.xpath("//input[@id='caste']"));
      c.click();
      Thread.sleep(2000);
      c.sendKeys("Porwal");
      Thread.sleep(2000);
      c.sendKeys(Keys.CONTROL + "\t"); 
      Thread.sleep(2000);
      System.out.print("caste entered"); 
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("arguments[0].scrollIntoView();",c);


      //continue
      driver.findElement(By.xpath("//*[@id=\"submit-form-basic\"]")).click();
      System.out.print("continue entered"); 		
      
      
      //education level
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='educationLevel']"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Doctorate')]"))).click();
       System.out.print("education level entered \n");

       //education field
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='educationField']"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Commerce')]"))).click();
       System.out.print("education field entered \n");

       //college
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='highestCollege']"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Acharya')]"))).click();
       System.out.print("education entered \n");

       //works with
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='workingWith']"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Private Company')]"))).click(); 
       System.out.print("works with entered \n");

      //working as
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='workingAs']"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Banking Professional')]"))).click();
       System.out.print("works as entered \n");

       //company name
       WebElement company = driver.findElement(By.xpath("//input[@id='employer']"));
       company.click();
       Thread.sleep(2000);
       company.sendKeys("A  PJ  Project");
       Thread.sleep(2000);
       company.sendKeys(Keys.CONTROL + "\t");
       Thread.sleep(2000);
       System.out.print("company entered \n");
       
       //income slider
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Monthly')]"))).click();
       JavascriptExecutor js = (JavascriptExecutor) driver;

       //income selector
       WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='income']")));
       Element.click();
       js.executeScript("arguments[0].scrollIntoView();", Element);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'₹ 60 to 80K monthly')]"))).click();
       System.out.print("income selector entered \n");
           
       //continue button
       driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

       //about brother
       Thread.sleep(2000);
       WebElement textarea= driver.findElement(By.xpath("//textarea"));
       Thread.sleep(2000);

       textarea.sendKeys("My brother is a good person who always looks for better opportunities in life. I'm very proud of him because he has done so much for our family and me. He is a wonderful person with great value and maybe for him it can be hard to admit that he is a great person with a big heart.");
       textarea.sendKeys(Keys.CONTROL + "\t");
       System.out.print("about him entered \n");
       
       //phone number
       wait.until(ExpectedConditions.elementToBeClickable(By.id("mobileNumber"))).sendKeys("8826232553");
       System.out.print("phone entered \n");
       
       //create profile
       driver.findElement(By.xpath("//span[contains(text(),'Create Profile')]")).click();

       //Close button
       driver.findElement(By.xpath("//a[@id='campaignclosebutton']")).click();
       
       //header match
       WebElement congrats = driver.findElement(By.xpath("//span[contains(text(),'Congrats!')]"));
       String text = congrats.getText();
     
       String exp = " Congrats! " + fname+ "'s Profile has been created.";
       if(text==exp) {
           System.out.println("Header matches");
       }
       
       driver.quit();
}
}
	