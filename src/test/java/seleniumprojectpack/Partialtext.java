package seleniumprojectpack;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

public class Partialtext {				
    		
    public void setup() {									
        String baseUrl = "http://demo.guru99.com/test/link.html";					
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("here")).click();					
        System.out.println("Title of page is: " + driver.getTitle());							
        driver.quit();			
    }	
    
    public void setup1() throws InterruptedException {									
        String baseUrl1 = "http://demo.guru99.com/test/link.html";					
        System.setProperty("webdriver.gecko.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\geckodriver.exe");					
        WebDriver driver = new FirefoxDriver();				
        		
        driver.get(baseUrl1);					
        driver.findElement(By.partialLinkText("here")).click();	
        Thread.sleep(2000);
        System.out.println("Title of page is: " + driver.getTitle());
        driver.quit();		 

    }
    public static void main(String args[]) throws InterruptedException {
    Partialtext pt =new Partialtext();
    pt.setup();
    pt.setup1();
    
    }
   
}