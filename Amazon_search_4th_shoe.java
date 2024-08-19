package Pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search_4th_shoe {

	public static void main(String[] args) throws InterruptedException 
	{
         ChromeDriver driver=new ChromeDriver();
		  
          driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		  e1.sendKeys("shoe");
		  Thread.sleep(2000);
		  
		 List<WebElement> e2= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		 
		 int count =e2.size();
		 System.out.println(count);
		 e2.get(3).click();
		 

		  
	}

}
