package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechminds_drag_drop {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.id("drag2"));
	
		
		WebElement drop=driver.findElement(By.id("div2"));

		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(drag, drop).perform();
		
		
		


	}

}
