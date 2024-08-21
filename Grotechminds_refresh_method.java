package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_refresh_method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Deepali");
		
		WebElement e2=driver.findElement(By.id("lname"));
		e2.sendKeys("Patil");
		
		WebElement e3=driver.findElement(By.id("email"));
		e3.sendKeys("deepalipatil");
		
		WebElement e4=driver.findElement(By.id("password"));
		e4.sendKeys("deepali@12");
		
		
		WebElement e5=driver.findElement(By.xpath("//input[@id='male']"));
		e5.click();
		
		
		WebElement e6=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		e6.sendKeys("Pune,Maharashtra,Pin-412207");
		
		WebElement e7=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		e7.sendKeys("Pune,Maharashtra,Pin-412207");
		
		WebElement e8=driver.findElement(By.xpath("//input[@id='Pincode']"));
		e8.sendKeys("412207");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		

	}

}
