package demoqa.vayuga;



import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class GaToolsQA {
	
	
		
	
		public void chrome() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rubalakshmim\\\\eclipse-workspace-selenium\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Actions act = new Actions(driver);
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstname.sendKeys("GEETANJALI");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastname.sendKeys("POTHULA");
		WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]"));
		email.sendKeys("geeta@123.gmail.com");
		WebElement genderfemale=driver.findElement(By.id("gender-radio-2"));
		act.click(genderfemale).perform();
		Thread.sleep(2000);
		boolean status1=genderfemale.isSelected();
		Assert.assertTrue(status1);
		System.out.println("Female RadioButton is Selected :"+status1);

		WebElement gendermale=driver.findElement(By.id("gender-radio-1"));
		boolean status2=gendermale.isSelected();
	    Assert.assertFalse(status2);
		System.out.println("Male RadioButton is Selected :"+status2);

		WebElement genderother=driver.findElement(By.id("gender-radio-3"));
		boolean status3=genderother.isSelected();
		Assert.assertFalse(status3);
		System.out.println("Other RadioButton is Selected :"+status3);

		WebElement mobileno = driver.findElement(By.cssSelector("#userNumber"));
		mobileno.sendKeys("9550046435");
		
		WebElement dateofbirth= driver.findElement(By.id("dateOfBirthInput"));
		act.click(dateofbirth).perform();
		WebElement monthdropdown = driver.findElement(By.className("react-datepicker__month-select"));
		monthdropdown.click();
		Select dropmonth = new Select(monthdropdown);
		dropmonth.selectByValue("3");
		WebElement yeardropdown = driver.findElement(By.className("react-datepicker__year-select"));
		yeardropdown.click();
		Select dropyear = new Select(yeardropdown);
		dropyear.selectByVisibleText("1995");
		WebElement dateselect = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"));
		dateselect.click();
		Thread.sleep(1000);
		WebElement hobbies=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		act.click(hobbies).perform();
		Thread.sleep(2000);
		WebElement picture=driver.findElement(By.id("uploadPicture"));
		act.click(picture).perform();
		//Thread.sleep(1000);
		String file ="C:\\Users\\rubalakshmim\\Pictures\\Screenshots\\petimage.png";	
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		WebElement currentaddress = driver.findElement(By.tagName("textarea"));
		currentaddress.sendKeys(" 1-2-3-4/A,Gandhinagar,Lucknow,UP");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
		WebElement submit = driver.findElement(By.id("submit"));
		act.click(submit).perform();
		}
        catch(Exception e) {
        	System.out.println("Site problem");
        }

		Thread.sleep(3000);
		driver.close();


		

		}
		public void firefox() throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
			firstname.sendKeys("GEETANJALI");
			WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
			lastname.sendKeys("POTHULA");
			WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]"));
			email.sendKeys("geeta@123.gmail.com");
			WebElement genderfemale=driver.findElement(By.id("gender-radio-2"));
			act.click(genderfemale).perform();
			Thread.sleep(2000);
			boolean status1=genderfemale.isSelected();
			Assert.assertTrue(status1);
			System.out.println("Female RadioButton is Selected :"+status1);

			WebElement gendermale=driver.findElement(By.id("gender-radio-1"));
			boolean status2=gendermale.isSelected();
		    Assert.assertFalse(status2);
			System.out.println("Male RadioButton is Selected :"+status2);

			WebElement genderother=driver.findElement(By.id("gender-radio-3"));
			boolean status3=genderother.isSelected();
			Assert.assertFalse(status3);
			System.out.println("Other RadioButton is Selected :"+status3);

			WebElement mobileno = driver.findElement(By.cssSelector("#userNumber"));
			mobileno.sendKeys("9550046435");
			
			WebElement dateofbirth= driver.findElement(By.id("dateOfBirthInput"));
			act.click(dateofbirth).perform();
			WebElement monthdropdown = driver.findElement(By.className("react-datepicker__month-select"));
			monthdropdown.click();
			Select dropmonth = new Select(monthdropdown);
			dropmonth.selectByValue("3");
			WebElement yeardropdown = driver.findElement(By.className("react-datepicker__year-select"));
			yeardropdown.click();
			Select dropyear = new Select(yeardropdown);
			dropyear.selectByVisibleText("1995");
			WebElement dateselect = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"));
			dateselect.click();
			Thread.sleep(1000);
			WebElement hobbies=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
			act.click(hobbies).perform();
			Thread.sleep(2000);
			WebElement picture=driver.findElement(By.id("uploadPicture"));
			act.click(picture).perform();
			//Thread.sleep(1000);
			String file ="C:\\Users\\rubalakshmim\\Pictures\\Screenshots\\petimage.png";	
			StringSelection selection = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			WebElement currentaddress = driver.findElement(By.tagName("textarea"));
			currentaddress.sendKeys(" 1-2-3-4/A,Gandhinagar,Lucknow,UP");
			
			WebElement submit = driver.findElement(By.id("submit"));
			submit.click();


			Thread.sleep(3000);


			}
public static void main(String[] args) throws InterruptedException, AWTException {
	GaToolsQA obj=new GaToolsQA();
	obj.chrome();
	obj.firefox();
}
}
	



