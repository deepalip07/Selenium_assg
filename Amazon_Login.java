package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) 
	{
	
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        
       WebElement u_name= driver.findElement(By.name("email"));
       u_name.sendKeys("7972542126");
        
       WebElement continue_btn=driver.findElement(By.id("continue"));
       continue_btn.click();
       
       WebElement password= driver.findElement(By.name("password"));
       password.sendKeys("7972542126");
       
       
       WebElement signin_btn= driver.findElement(By.id("signInSubmit"));
       signin_btn.click();
       
       
       
	}

}
