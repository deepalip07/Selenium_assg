package selenium.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_launch_and_Search_product 
{
	ChromeDriver driver=new ChromeDriver();

	@BeforeMethod
	public void launch()
	{
		
        driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
	}
	@Test()
	public void search_product() throws InterruptedException
	{
		 WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		  e1.sendKeys("shoe");
		  Thread.sleep(2000);
		  List<WebElement> e2= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
			 
			 int count =e2.size();
			 System.out.println(count);
			 e2.get(3).click(); 
			 WebElement e3 =driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
			 e3.click();
			 
			
	}
}
