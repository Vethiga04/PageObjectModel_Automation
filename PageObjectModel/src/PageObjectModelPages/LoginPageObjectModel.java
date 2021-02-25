package PageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjectModel {
	
	@FindBy(how=How.XPATH ,using="//div/input[@id='email']")
	public static WebElement Email;
	
	@FindBy(xpath="//span/input[@id='passwd']")
	public static WebElement Password;
	
	@FindBy(xpath="//*/button[@type='submit' and @name='SubmitLogin']")
	public static WebElement Submitbtn;
	
	
}
