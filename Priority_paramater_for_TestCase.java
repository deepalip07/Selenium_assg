package selenium.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_paramater_for_TestCase 
{
	@BeforeMethod
	public void launch()
	{
		System.out.println("Browsr launch...");
	}
	
	@Test(priority=0)
	public void login()
	{
		System.out.println("Login..");
	}
	
	@Test(priority=-1)
	public void search_product1()
	{
		System.out.println("Search product..");
	}
	
	@Test(priority=1)
	public void search_product2()
	{
		System.out.println("Search product..");
	}
	
}
