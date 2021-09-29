package seleniumprojectpack;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;		

public class Text {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://demoqa.com/automation-practice-form";					
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.findElement(By.id("day")).sendKeys("6");
        driver.findElement(By.id("month")).sendKeys("Nov");
        driver.findElement(By.id("year")).sendKeys("2000");
    }		
}
