package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_create_accnt {

	public static void main(String[] args) 
	{
		
         ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
       WebElement create_accnt_btn= driver.findElement(By.linkText("Create new account"));
	    
	     create_accnt_btn.click();
	  
	  WebElement first_name=driver.findElement(By.name("firstname"));
	  first_name.sendKeys("Yogesh");
	 
	  
	  WebElement last_name=driver.findElement(By.name("lastname"));
	  last_name.sendKeys("Patil");
	
	  
	 WebElement email=driver.findElement(By.name("reg_email__"));
	  email.sendKeys("deepali@gmail.com");
	  
	
	WebElement password=driver.findElement(By.name("reg_passwd__"));
	  password.sendKeys("Test@3333");
	}

}
