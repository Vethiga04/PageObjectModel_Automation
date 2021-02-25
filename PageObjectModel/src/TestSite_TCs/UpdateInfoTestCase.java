package TestSite_TCs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModelPages.LoginPageObjectModel;
import PageObjectModelPages.UpdateInfoPageObjectModel;



public class UpdateInfoTestCase {
	
	@Test
	public void UpdateInformation() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TheShy\\Documents\\Learning_V\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		PageFactory.initElements(driver, LoginPageObjectModel.class);
		
		LoginPageObjectModel.Email.sendKeys("abctest01@mailinator.com");
		LoginPageObjectModel.Password.sendKeys("123456");
		LoginPageObjectModel.Submitbtn.click();

		
		PageFactory.initElements(driver, UpdateInfoPageObjectModel.class);
		
		UpdateInfoPageObjectModel.PersonalInfoPane.click();
		
		UpdateInfoPageObjectModel.FirstnameUpdate.clear();
		UpdateInfoPageObjectModel.FirstnameUpdate.sendKeys("Testing");
		
		UpdateInfoPageObjectModel.LastnameUpdate.clear();
		UpdateInfoPageObjectModel.LastnameUpdate.sendKeys("Selenium");
		
		UpdateInfoPageObjectModel.PasswdUpdate.clear();
		UpdateInfoPageObjectModel.PasswdUpdate.sendKeys("123456");
		UpdateInfoPageObjectModel.SaveBtn.click();
		driver.quit();
		
	}

}
