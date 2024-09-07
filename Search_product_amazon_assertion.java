package Assertion_concept;

import org.openqa.selenium.By;
import org.openqa.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_product_amazon_assertion 
{
	@Test()
	public void search_product() throws InterruptedException
	{
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	  WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	 e1.sendKeys("shoe");
	  Thread.sleep(2000);
	  Assert.assertEquals(e1.isDisplayed(), true, "Assertion pass");
		  
  }
    
   
	
}
