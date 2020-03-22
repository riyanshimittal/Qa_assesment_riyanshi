package test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

     static  WebDriver driver;
        public static void main(String[] args) 
        {
            System.setProperty("webdriver.chrome.driver","C:/Users/riyanshi.mittal/Downloads/chromedriver_win32/chromedriver.exe");
               System.setProperty("webdriver.chrome.silentOutput", "true");
              driver = new ChromeDriver();
            driver.get("http://www.google.co.in/");
             driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    

          driver.manage().window().maximize();
          driver.findElement(By.name("q")).sendKeys("bottle");
          driver.findElement(By.name("btnK")).submit();
            
            List<WebElement> links=driver.findElements(By.tagName("a"));
            System.out.println("Total links are "+links.size());
            for(int i=0;i<links.size();i++)
            {
             WebElement ele= links.get(i);    
                String url=ele.getAttribute("href");
                verifyLinkActive(url);
                         }
                    }
        
        public static void verifyLinkActive(String linkUrl)
        {
        	File file= new File("C:\\Users\\riyanshi.mittal\\Desktop\\dec.txt");
    		try {
    			file.createNewFile();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
            try 
            {
               URL url = new URL(linkUrl);
               HttpURLConnection huc=(HttpURLConnection)url.openConnection();
               huc.setConnectTimeout(3000);
               huc.connect();
               if(huc.getResponseCode()==200)
               {
                   System.out.println(linkUrl+" - "+huc.getResponseMessage());
                }
              if(huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
               {
                   System.out.println(linkUrl+" - "+huc.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
                }
            } catch (Exception e) {
            }  
}
}