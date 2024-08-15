package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_grotechminds 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.youtube.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		  search.sendKeys("grotechminds");
		  search.sendKeys(Keys.ENTER);
		  
		  driver.findElement(By.partialLinkText("Subscribe")).click();
		
	}

}
