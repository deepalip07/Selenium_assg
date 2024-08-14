package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn_Login {

	public static void main(String[] args) 
	{
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.linkedin.com");
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("username")).sendKeys("deepalip071992@gmail.com");
        driver.findElement(By.id("password")).sendKeys("ABC12345");
        //driver.findElement(By.className("btn__primary--large from__button--floating"));
       driver.findElement(By.xpath("//button[@type='submit']")).click();
        
	    
	}

}
