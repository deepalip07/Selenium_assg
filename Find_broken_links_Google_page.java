package Pkg1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_broken_links_Google_page {

	public static void main(String[] args) throws IOException 
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
		      System.out.println(url);
		      
		      verify_each_url(url);
			  
		  }

	}
	
	static void verify_each_url(String url) throws IOException
	{
		
		URL u1=new URL(url);
		
		HttpURLConnection h1= (HttpURLConnection) u1.openConnection();
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
