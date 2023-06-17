package Cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects extends TestBase {
	
	String u ;
	String p ;

	@FindBy(xpath= "//input[contains(@placeholder , 'Username')]")
	WebElement username ;
	
	@FindBy(xpath="//input[contains(@placeholder , 'Password')]")
	WebElement password ;
	
	@FindBy(xpath="//input[contains(@data-test, 'login-button')]")
	WebElement login ;
	
	@FindBy(xpath = "//div[text() = 'Swag Labs']")
	WebElement test;
	

	public LoginObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginvalidation()
	
	{
		username.sendKeys("standard_user");
		u = username.getText();
		password.sendKeys("secret_sauce");
		p = password.getText();
		login.click();
	}
	
	public void propercredentials()
	{
		String un = "standard_user" ;
		String pas = "secret_sauce" ;
		
		if(u.equals(un)&& pas.equals(p))
		{
			System.out.println("Proper Credntials Test is Passes");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
	}
	
	public void successvaliation()
	{
		String p = test.getText();
		if(p.equals("Swag Labs"))
		{
			System.out.println("Test is Passed");
		}
	}
	
	
	public void teardown()
	{
		driver.close();
	}

}
