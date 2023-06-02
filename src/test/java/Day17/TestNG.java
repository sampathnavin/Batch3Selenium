package Day17;



import org.testng.annotations.Test;


public class TestNG {
	
	@Test
	public void logintc01()
	{
		System.out.println("Login Test Case");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "logintc01")
	public void hometc02()
	{
		System.out.println("Home Test Case");
	}

	
	@Test(dependsOnMethods = "logintc01")
	public void checkouttc03()
	{
		System.out.println("Checkout Test Case");
	}
	
	@Test(dependsOnMethods = "logintc01")
	public void productinfotc04()
	{
		System.out.println("Product Info Test Case");
	}
}
