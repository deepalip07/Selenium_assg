package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com");
		  Thread.sleep(2000);
		   WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		   email.sendKeys("deepali07");
		   
		   WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		   password.sendKeys("Test@123");
		   
		   WebElement login_btn=driver.findElement(By.xpath("//button[@name='login']"));
		   login_btn.click();
	}

}
