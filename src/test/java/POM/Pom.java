package POM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pom extends testbase{
	Login lp ;
	
	@BeforeTest
	public void bt()
	{
		intilize();
	}
	
	@Test
	public void tes()
	{
		lp = new Login();
		lp.loginvalidation();
	}
	
	@AfterTest
	public void at()
	{
		lp.teardown();
	}
	
	

}
