package Pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_print_all_Links_LinkTexts_on_Homepage {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  
		  List<WebElement> l1= driver.findElements(By.tagName("a"));
		  
		  int count=l1.size();
		  System.out.println(count);
		  
		  for(int i=0;i<count;i++)
		  {
			  WebElement e1= l1.get(i);
			  String url=e1.getAttribute("href");
			  String linktext=e1.getText();
			  
			  System.out.println(linktext);
			  System.out.println(url);
			  
		  }
		  

	}

}
