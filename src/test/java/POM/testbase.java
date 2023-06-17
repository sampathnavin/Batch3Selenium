package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	
	//POM - Page Object Model - Test pattern designing 
	
	//  It will help us to structure our codes 
	
	public static WebDriver driver ;
	
	public static void intilize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Batch3Selenium\\src\\test\\resources\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
	}

}
