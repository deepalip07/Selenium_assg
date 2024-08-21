package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_back_drag_drop_prog {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.id("container-1"));
	
		
		WebElement drop=driver.findElement(By.id("drag2"));

		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(drag, drop);

	}

}
