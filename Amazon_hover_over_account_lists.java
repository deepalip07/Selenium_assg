package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hover_over_account_lists 
{

	public static void main(String[] args) 
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
		Actions a=new Actions(driver);
		
		a.moveToElement(e1).perform();
		
		WebElement e2=driver.findElement(By.linkText("Sign in"));
		e2.click();
	}

}
