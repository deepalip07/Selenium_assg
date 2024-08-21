package Pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_screenshot_math_random 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    TakesScreenshot t1=driver;
			
	    File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\eclipse\\Selenium_proj\\src\\Screenshot\\amazon"+Math.random()+".png");
		FileHandler.copy(source, destination);


	}

}
