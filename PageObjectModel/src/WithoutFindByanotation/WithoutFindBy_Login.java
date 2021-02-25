package WithoutFindByanotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFindBy_Login {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	@Test
	public void WithoutFindByLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TheShy\\Documents\\Learning_V\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, WithoutFindBy_Login.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin12");
		btnLogin.click();
//		driver.quit();

		
	}

}
