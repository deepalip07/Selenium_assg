package selenium.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Two_paramaters_inSingle_testAnotation 
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
	
	@Test(priority=-1,invocationCount=4)
	public void search_product1()
	{
		System.out.println("Search product..");
	}
}
