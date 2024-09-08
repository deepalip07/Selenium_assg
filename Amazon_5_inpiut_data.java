package Data_provider_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_5_inpiut_data 
{
	
	@DataProvider(name="data1")
	public Object method1()
	{
		return new Object[][] { {"shoe"} ,{"toy car"},{"watch"},{"bag"},{"kids tshirts"} };
	}
	
	
	@Test(dataProvider="data1")
	public void testcase1(String amazon_product)
	{
          ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      WebElement product_search_text=driver.findElement(By.id("twotabsearchtextbox"));
	      product_search_text.sendKeys(amazon_product);
	      product_search_text.sendKeys(Keys.ENTER);
	      
	      //Assert.assertEquals(product_search_text.isDisplayed(), true);
	      
	      Assert.assertNotEquals(product_search_text.isDisplayed(), false, "Sorry, test case failed..");
	      
	      driver.quit();
	}

}
