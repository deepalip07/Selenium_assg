package Pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.util.Date;


public class Amazon_screenshot_by_current_time 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    TakesScreenshot t1=driver;
			
	    File source=t1.getScreenshotAs(OutputType.FILE);
	    Date d=new Date();
	     System.out.println(d.getTime());
	     
	     Date d1=new Date();
	     System.out.println("Current Time--->"+d1);
	  String time=   d1.toString();
	  System.out.println(time);
	    
	   File destination=new File("C:\\eclipse\\Selenium_proj\\src\\Screenshot\\amazoncurrentdate_time"+d1.getTime()+".png"
			);
		FileHandler.copy(source, destination);

	}

}
