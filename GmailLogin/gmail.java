package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class gmail {
    static WebDriver driver;
  public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:/Users/riyanshi.mittal/Downloads/chromedriver_win32/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://accounts.google.com/signin");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
       WebElement email= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
       email.sendKeys("riyanshimittal45");
       driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
       WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
       password.sendKeys("1a2b3c");
       driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
       //driver.findElement(By.xpath("//input[@type='password']")).click();
       }
}