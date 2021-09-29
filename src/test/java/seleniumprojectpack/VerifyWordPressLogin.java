package seleniumprojectpack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
* @author Mukesh_50
*
*/
public class VerifyWordPressLogin
{


public static void main (String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\rubalakshmim\\eclipse-workspace-selenium\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();


driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
Login login=new Login(driver);
login.typeUserName("Admin");
Thread.sleep(2000);
login.typePassword("admin123");
Thread.sleep(2000);

login.clickOnLoginButton();
driver.quit();
}
}
