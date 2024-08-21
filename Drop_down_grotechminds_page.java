package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_grotechminds_page {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("Choice1"));
	    Select s1=new Select(e1);
		s1.selectByVisibleText("Demo5");
		
		WebElement e2=driver.findElement(By.id("Choice2"));
	    Select s2=new Select(e2);
		s2.selectByVisibleText("practice2");
		
		WebElement e3=driver.findElement(By.id("Choice3"));
	    Select s3=new Select(e3);
		s3.selectByIndex(4);
		
		WebElement e4=driver.findElement(By.id("Choice4"));
	    Select s4=new Select(e4);
		s4.selectByIndex(4);
		
		WebElement e5=driver.findElement(By.id("Choice5"));
	    Select s5=new Select(e5);
		s5.selectByIndex(4);
		
		WebElement e6=driver.findElement(By.id("Choice6"));
	    Select s6=new Select(e6);
		s6.selectByIndex(5);
		
		WebElement e7=driver.findElement(By.id("Choice7"));
	    Select s7=new Select(e7);
		s7.selectByIndex(5);
		
		WebElement e8=driver.findElement(By.id("Choice8"));
	    Select s8=new Select(e8);
		s8.selectByIndex(2);
		
		
		WebElement e9=driver.findElement(By.id("Choice9"));
	    Select s9=new Select(e9);
		s9.selectByIndex(4);
		
		
		WebElement e10=driver.findElement(By.id("Choice10"));
	    Select s10=new Select(e10);
		s10.selectByIndex(4);
		

	}

}
