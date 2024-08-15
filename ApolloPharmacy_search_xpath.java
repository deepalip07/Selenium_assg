package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApolloPharmacy_search_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.apollopharmacy.in/deal?utm_source=google&utm_medium=srb&campaignid=13412336836&adgroupid=164433699751&keyword=apollopharmacy&device=c&adtype=&product_id=&utm_campaign=Apollo_Branding_Pharmacy_ROI&utm_content=Apollo_Pharmacy_EM&gad_source=1&gclid=Cj0KCQjwzva1BhD3ARIsADQuPnU3Lt7vItQu4XD3UUYbUs408YIUXTl1UK1dkCRTU99UXOP1t5mLsfUaAgwQEALw_wcB");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		
		  WebElement search_text= driver.findElement(By.className("Home_searchSelectMain__VL1lN"));
		  search_text.click();
		  
		  WebElement search_product=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		  
		  search_product.sendKeys("pcm");
		  search_product.sendKeys(Keys.ENTER);
		  
		   
		
		   
	
		   

	}

}
