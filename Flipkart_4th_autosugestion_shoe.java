package Pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_4th_autosugestion_shoe 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver=new ChromeDriver();
		  
         driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  WebElement e1=  driver.findElement(By.name("q"));
		  e1.sendKeys("shoe");
		  Thread.sleep(1000);
		  
		List<WebElement> e2=  driver.findElements(By.xpath("(//form[@class='_2rslOn header-form-search OpXDaO']/ul/li)"));
		  Thread.sleep(1000);
		int count=e2.size();
		System.out.println(count);
		
		e2.get(3).click();

	}

}
