package Pkg1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_add_to_cart {

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
		
		WebElement nth=driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[2]"));
		nth.click();

		Set<String> s1=driver.getWindowHandles();
		Iterator i1=s1.iterator();
		
		String parentid=(String) i1.next();
		String childid=(String) i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		
		WebElement add_to_cart_btn=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		
		add_to_cart_btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
