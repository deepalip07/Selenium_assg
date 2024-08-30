package selenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_testNG_annotations 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before Suit annotation...");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test annotation...");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class annotation...");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method annotation...");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test annotation.");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("After method annotation..");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("After class annotation...");
		
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("After test annotation..");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("After Suit annptation..");
	}
	

}
