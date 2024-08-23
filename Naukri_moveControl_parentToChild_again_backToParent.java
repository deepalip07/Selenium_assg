package Pkg1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_moveControl_parentToChild_again_backToParent 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_B");
		  driver.manage().window().maximize();
		  WebElement e1=driver.findElement(By.xpath("//span[@class='google-text']"));
		  e1.click();
		  Thread.sleep(2000);
		  
		  Set<String> s= driver.getWindowHandles();
			Iterator i1=s.iterator();
		  
		  String parentid=(String) i1.next();
		  String childid=(String) i1.next();
		  
		  System.out.println(parentid);
		  System.out.println(childid);
		  
		  driver.switchTo().window(childid);
		 // driver.close();
		  
		  driver.switchTo().window(parentid);
		  

	}

}
