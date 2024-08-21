package Pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google_page_screenshot 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		
			TakesScreenshot t1=				driver;
			
			File source=			t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\eclipse\\Selenium_proj\\src\\Screenshot\\google"+ new getWindow_handle().getClass()   +".png");
		FileHandler.copy(source, destination);
	

	}

}
