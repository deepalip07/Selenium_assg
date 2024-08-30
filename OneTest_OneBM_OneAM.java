package selenium.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneTest_OneBM_OneAM 
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
	
	@AfterMethod
	public void browser_quit()
	{
		System.out.println("Browser Quit..");
	}
}
