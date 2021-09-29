package seleniumprojectpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IndividualActivity {
	public static void main(String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		 
          WebElement username=driver.findElement(By.id("user-name"));
          username.sendKeys("standard_user");
          WebElement pass=driver.findElement(By.id("password"));
          pass.sendKeys("secret_sauce");
          driver.findElement(By.name("login-button")).click();
          Thread.sleep(1000);
          String actualTitle = driver.getTitle();
          String expectedTitle = "SWAG LABS";
          if(actualTitle.equalsIgnoreCase(expectedTitle))
  			System.out.println("Title Matched");
  		else
  			System.out.println("Title didn't match");
          driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
          driver.findElement(By.className("shopping_cart_container")).click();
          driver.findElement(By.id("checkout")).click();
          driver.findElement(By.id("first-name")).sendKeys("Ruba");
          driver.findElement(By.id("last-name")).sendKeys("Lakshmi");
         driver.findElement(By.id("postal-code")).sendKeys("607001");
         driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("finish")).click();
		 driver.findElement(By.id("back-to-products")).click();
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		 Thread.sleep(3000);
		 driver.quit();



         
	}
}


