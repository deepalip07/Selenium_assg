package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg_163 {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  WebElement search=driver.findElement(By.id("APjFqb"));
		  
		  if(search.isDisplayed() && search.isEnabled())
		  {
			  search.sendKeys("India");
		  }

	}

}
