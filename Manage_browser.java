package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_browser {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("http://www.linkedin.com");
		//driver.findElement(By.name("Sign in")).click();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.className("gb_y")).click();
		//driver.findElement(By.id("identifierId")).sendKeys("deepalip071992@gmail.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("deepalip071992@gmail.com");
		//driver.findElement(By.className("VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b")).click();
	     driver.findElement(By.className("jR8x9d nyoS7c UzCXuf EIlDfe")).click();
	}

}
