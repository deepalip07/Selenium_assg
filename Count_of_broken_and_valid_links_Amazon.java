package Pkg1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_of_broken_and_valid_links_Amazon 
{
	
	static int broken_link=0;
	static int valid_link=0;
	
	static int handled_broken_link=0;
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int count=l1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e1=l1.get(i);
			String url=e1.getAttribute("href");
			System.out.println(url);
			verify_each_links(url);
		}
	}
	static void verify_each_links(String url) throws IOException
	{
       try 
       {	
		URL u1=new URL(url);
		HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
		
		if(h1.getResponseCode()==200)
		{
			System.out.println("Valid link"+h1.getResponseCode()+""+h1.getResponseMessage());
			valid_link++;
			System.out.println("Count of valid link--->"+valid_link);
		}
		
		else
		{
			if(h1.getResponseCode()>=400)
			{
				System.out.println("Broken link"+h1.getResponseCode()+""+h1.getResponseMessage());
				broken_link++;
				System.out.println("Broken link count-->"+broken_link);
			
			
			}
		}
		
       }
	
               catch(MalformedURLException a1)
    		   {
    	                System.out.println("It is broken link-->Handled");
    	        }
               handled_broken_link++;
                System.out.println("Handled Broken link count-->"+handled_broken_link);


	}

	}


