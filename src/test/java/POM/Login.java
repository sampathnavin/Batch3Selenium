package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends testbase {
	
	@FindBy(xpath= "//input[contains(@placeholder , 'Username')]")
	WebElement username ;
	
	@FindBy(xpath="//input[contains(@placeholder , 'Password')]")
	WebElement password ;
	
	@FindBy(xpath="//input[contains(@data-test, 'login-button')]")
	WebElement login ;
	
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginvalidation()
	
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
}
