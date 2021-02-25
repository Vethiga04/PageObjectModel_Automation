package TestSite_TCs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModelPages.LoginPageObjectModel;

public class LoginTestCase {
	
  @Test
  public void Login() throws IOException {
	  WebDriver driver = null;
	  
	  FileInputStream fileInputStream=new FileInputStream("config.properties");
	  Properties properties=new Properties();
	  properties.load(fileInputStream);
	  
	  String Browser=properties.getProperty("Browser");
	  String Driverlocation=properties.getProperty("DriverLocation"); 
	  
	  if(Browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", Driverlocation);
		  driver=new ChromeDriver();
	  }
	  else if(Browser.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver", Driverlocation);
		  driver=new FirefoxDriver();
	  }
	  

	  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  
	  PageFactory.initElements(driver, LoginPageObjectModel.class);
	  
	  LoginPageObjectModel.Email.sendKeys("abctest01@mailinator.com");
	  LoginPageObjectModel.Password.sendKeys("123456");
	  LoginPageObjectModel.Submitbtn.click();
	  driver.quit();

//	  LoginPageObjectModel.Email(driver).sendKeys("abctest01@mailinator.com");
//	  LoginPageObjectModel.Password(driver).sendKeys("123456");;
//	  LoginPageObjectModel.Submitbtn(driver).click();
//	  driver.quit();
	  
	  
//	  
//	  WebElement Email=driver.findElement(By.xpath("//div/input[@id='email']"));
//	  WebElement Password=driver.findElement(By.xpath("//span/input[@id='passwd']"));
//	  WebElement SignInBtn=driver.findElement(By.xpath("//*/button[@type='submit' and @name='SubmitLogin']"));
//	  
//	  Email.sendKeys("abctest01@mailinator.com");
//	  Password.sendKeys("123456");
//	  SignInBtn.click();
	  
  }
}
