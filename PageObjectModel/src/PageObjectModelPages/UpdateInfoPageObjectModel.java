package PageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateInfoPageObjectModel {
	

	@FindBy(xpath="//a/span[contains(text(),'My personal information')]")
	public static WebElement PersonalInfoPane;
	
	@FindBy(xpath="//div/input[@class='is_required validate form-control' and @id='firstname']")
	public static WebElement FirstnameUpdate;
	
	@FindBy(xpath="//div/input[@class='is_required validate form-control' and @id='lastname']")
	public static WebElement LastnameUpdate;
	
	@FindBy(xpath="//input[@class='is_required validate form-control' and @name='old_passwd']")
	public static WebElement PasswdUpdate;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	public static WebElement SaveBtn;

	
}
