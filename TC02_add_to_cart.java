package selenium.TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC02_add_to_cart extends TC01_launch_and_Search_product
{
	@Test()
	public void add_to_cart() throws InterruptedException
	{
		try 
		{
		Set<String> s1=driver.getWindowHandles();
	
	    Iterator i1=s1.iterator();
	
	    String parentid=(String) i1.next();
	    String childid=(String) i1.next();
	
         System.out.println(parentid);
	     System.out.println(childid);
	
	    driver.switchTo().window(childid);
	    Thread.sleep(2000);
	 
	     WebElement e4=driver.findElement(By.id("add-to-cart-button"));
	
	      e4.click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}
}
