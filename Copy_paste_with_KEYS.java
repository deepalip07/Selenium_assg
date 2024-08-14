package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_paste_with_KEYS 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://grotechminds.com/registration/");
		 WebElement fn= driver.findElement(By.name("fname"));
		 fn.sendKeys("Deepali");
		  fn.sendKeys(Keys.CONTROL+"a");
		 
		  fn.sendKeys(Keys.CONTROL+"c");
		  WebElement ln=driver.findElement(By.name("lname"));
		  ln.sendKeys(Keys.CONTROL+"v");
	}

}
