package selenium.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class enabled_testCase
{
  
	@BeforeMethod
	public void launch()
	{
		System.out.println("Browsr launch...");
	}
	
	@Test
	public void login()
	{
		System.out.println("Login..");
	}
	
	@Test(enabled=false)
	public void search_product()
	{
		System.out.println("Search product..");
	}
	
	
	@AfterMethod
	public void browser_quit()
	{
		System.out.println("Browser Quit..");
	}
	
}
