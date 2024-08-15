package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_first_shoe_amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		 WebElement search= driver.findElement(By.xpath("(//input)[5]"));
		 
		 search.sendKeys("Shoes");
		 search.sendKeys(Keys.ENTER);
		 
		 WebElement shoe_click=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		
		 shoe_click.click();
	}

}
