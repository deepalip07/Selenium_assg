package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_xpath 
{

	public static void main(String[] args) 
	{
	  ChromeDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	 WebElement search= driver.findElement(By.xpath("(//input)[5]"));
	 
	 search.sendKeys("Shoes");
	 search.sendKeys(Keys.ENTER);
	}

}
