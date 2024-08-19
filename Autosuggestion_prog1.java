package Pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_prog1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  WebElement e1=driver.findElement(By.name("q"));
		  e1.sendKeys("Banglore");
		  Thread.sleep(3000);
		  
		  List<WebElement> e2=driver.findElements(By.xpath("(//ul[@class='G43f7e']/li)"));
		  int count=e2.size();
		  System.out.println(count);
		  
		  e2.get(7).click();
	}

}
