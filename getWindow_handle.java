package Pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class getWindow_handle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getTitle());
	

	}

}
