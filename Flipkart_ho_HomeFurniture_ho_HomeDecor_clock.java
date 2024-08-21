package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_ho_HomeFurniture_ho_HomeDecor_clock {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		
	
		
		WebElement e1=driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		Actions a=new Actions(driver);
		
		a.moveToElement(e1).perform();
	
		
		WebElement e2=driver.findElement(By.xpath("//a[.='Home Decor']"));
	    Actions a1=new Actions(driver);
		
		a.moveToElement(e2).perform();
		
		WebElement e3=driver.findElement(By.linkText("Clocks"));
		e3.click();
		
		
	    
		
		
		

	}

}
