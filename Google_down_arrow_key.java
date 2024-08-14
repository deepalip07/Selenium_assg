package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_down_arrow_key 
{

	public static void main(String[] args) 
	{
		
		
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.google.com");
		  
		  WebElement search=driver.findElement(By.id("APjFqb"));
		  search.sendKeys("India");
		  search.sendKeys(Keys.ARROW_DOWN);
		  search.sendKeys(Keys.ARROW_DOWN.ENTER);
	}
}


