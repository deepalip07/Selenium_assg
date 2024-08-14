package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_absolute_xpath 
{

	public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("file:///C:/Users/Admin/Desktop/Deepali/learningHTML1.html");
		  driver.manage().window().maximize();
		  WebElement u_name=driver.findElement(By.xpath("(/html/body/input)[1] "));
		  u_name.sendKeys("Deepali");
		  
		  WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		  hint.sendKeys("GTM");
		  
		  WebElement password=driver.findElement(By.xpath("(/html/body/input)[3]"));
		  password.sendKeys("Test@12345");
		  
		  WebElement f_name=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		  f_name.sendKeys("Deepa");
		  
		  WebElement checkbox_1=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		  checkbox_1.click();
		 
				  
	      WebElement radio_1=driver.findElement(By.xpath(" (/html/body/input)[5]"));
		  radio_1.click();
		  
		  
		  WebElement checkbox_4=driver.findElement(By.xpath("(/html/body/input)[6]"));
		  checkbox_4.click();	
		  
		  
		  WebElement link=driver.findElement(By.linkText("Click to know about us"));
		  link.click();
		  

	}

}
