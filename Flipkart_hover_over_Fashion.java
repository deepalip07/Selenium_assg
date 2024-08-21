package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hover_over_Fashion {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//span[.='Fashion']"));
		Actions a=new Actions(driver);
		
		a.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.linkText("Men's T-Shirts"));
		e2.click();
		

	}

}
