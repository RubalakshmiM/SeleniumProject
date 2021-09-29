package seleniumprojectpack;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GaActivity{
	
public static void main(String[] args) throws InterruptedException, AWTException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\chromedriver.exe");
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
	Assert.assertTrue(genderfemale.isSelected());
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
	/*WebElement input=driver.findElement(By.id("subjectsContainer"));
	act.click(input).perform();
	input.sendKeys("Comp");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);

	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("argument[0].value='C'", input);
	Thread.sleep(2000);
	List<WebElement> subject=driver.findElements(By.id("subjectsContainer"));
	System.out.println(subject.size());

	 for (WebElement webElement : subject) {
	if(webElement.getText().equals("Computer Science")) {
	act.click(webElement).perform();
	break;
	}
	}
	*/
	WebElement picture=driver.findElement(By.id("uploadPicture"));
	act.click(picture).perform();

	Thread.sleep(3000);


	//WebElement locator6 = driver.findElement(By.tagName("textarea"));
	//locator6.sendKeys(" 1-2-3-4/A,Gandhinagar,Lucknow,UP");

	 //WebElement state = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper form:nth-child(2) div.mt-2.row:nth-child(10) div.col-md-4.col-sm-12:nth-child(2) div.css-2b097c-container > div.css-yk16xz-control"));
	//act.click(state).perform();
	//Select dropstate = new Select(state);
	//dropstate.selectByIndex(1);
	/*WebElement city = driver.findElement(By.className("css-1wa3eu0-placeholder"));
	state.click();
	Select dropcity = new Select(city);
	dropcity.selectByVisibleText("Lucknow");*/

	}

	}
