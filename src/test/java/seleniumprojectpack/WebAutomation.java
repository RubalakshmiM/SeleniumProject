package seleniumprojectpack;


import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	public class WebAutomation {
		public static void main(String[]args) throws InterruptedException {
			
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			 
			  String startURL =("http://demo.guru99.com/test/newtours/"); 
		 
		String expected= "http://demo.guru99.com/test/newtours/";// assert equals using string url
		 Assert.assertEquals(expected, startURL);
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/"); 
		driver.manage().window().maximize();
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Welcome: Mercury Tours");//assertnotnull
		assertNotNull(verifyTitle);
		
		assertTrue(verifyTitle); //checking the title
		String ExpectedTitle = "Welcome: Mercury Tours";
		assertNotEquals(ExpectedTitle, "hhhhhhhhhhhhhhhh"); // assert not equals

		

		
		//#1-->finding element by partialLinkText
		
		WebElement contact = driver.findElement(By.partialLinkText("CON")); 
		contact.click();
		Thread.sleep(1000);
		
		//#2-->finding element by cssSelector
		
		WebElement BackToHome = driver.findElement(By.cssSelector("tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) a:nth-child(1) > img:nth-child(1)")); 
		BackToHome.click();
		
		
		//#3-->finding element by LinkText
		
		WebElement register = driver.findElement(By.linkText("REGISTER")); 
		register.click();
		
		//#4-->finding element by name
		
		WebElement firstname = driver.findElement(By.name("firstName")); 
		firstname.sendKeys("GEETANJALI");
		Assert.assertTrue(firstname.isDisplayed());    //is displayed assertion
		//#5-->finding element by absolute xpath
		
		WebElement lastname = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")); 
		lastname.sendKeys("POTHULA");
	
		
		//#6--->finding element by relative xpath
		
		WebElement phonenumber = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")); 
		phonenumber.sendKeys("987654321");
		
		
		
		 
		
		//#7--->//finding element by id	
		
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("demoguru@gmail.com");
		
		WebElement address = driver.findElement(By.name("address1")); 
		address.sendKeys("11,36 vv street,Taramani");
		
		WebElement city = driver.findElement(By.name("city")); 
		Assert.assertTrue(city.isEnabled());          //is enabled assertion
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.name("state")); 
		state.sendKeys("TamilNadu");
		
		WebElement postalcode = driver.findElement(By.name("postalCode")); 
		postalcode.sendKeys("636117");
		
		//#8--->//finding element by Tagname
		
		WebElement dropdown=driver.findElement(By.tagName("select"));
		Select select1 = new Select(dropdown);
		select1.selectByVisibleText("INDIA");
		
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("ruba123");
		
		WebElement password=driver.findElement(By.xpath(" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
		password.sendKeys("ruba@12345");
		
		WebElement Confirmpassword=driver.findElement(By.name("confirmPassword"));
		Confirmpassword.sendKeys("ruba@12345");
		
		WebElement Submit=driver.findElement(By.name("submit"));
		Submit.click();
			}
	}
		