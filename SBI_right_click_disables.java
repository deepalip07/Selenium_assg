package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_right_click_disables {

	public static void main(String[] args) throws InterruptedException 
	{
	 
  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.google.com");
		  
		  driver.manage().window().maximize();
		  
		  WebElement search=driver.findElement(By.id("APjFqb"));
		  search.sendKeys("sbi net banking");
		  search.sendKeys(Keys.ENTER);
		  WebElement cont_btn= driver.findElement(By.partialLinkText("Continue to Login"));
		  Thread.sleep(3000);
		   cont_btn.click();
		   
		   WebElement cont_login_btn=driver.findElement(By.className("login_button"));
		   Thread.sleep(3000);
		   cont_login_btn.click();
		   
		   WebElement u_name=driver.findElement(By.id("username"));
		   u_name.sendKeys("Deepali");
		   
		   WebElement password=driver.findElement(By.id("label2"));
		   password.sendKeys("Test@1234");
		   
		   WebElement login_btn=driver.findElement(By.id("Button2"));
		   
		   login_btn.click();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
	

}
