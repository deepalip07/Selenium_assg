package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_prog {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		
		Thread.sleep(2000);
		
		a.contextClick(e1).perform();
		
		
    
	}

}
