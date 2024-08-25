package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_javascript_popup_Grotechminds_submitForm {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Deepali");
		
		WebElement e2=driver.findElement(By.id("lname"));
		e2.sendKeys("Patil");
		
		WebElement e3=driver.findElement(By.id("email"));
		e3.sendKeys("deepalipatil@gmail.com");
		
		WebElement e4=driver.findElement(By.id("password"));
		e4.sendKeys("deepali@12");
		
		
		WebElement e5=driver.findElement(By.xpath("//input[@id='male']"));
		e5.click();
	   
		
		WebElement e6=driver.findElement(By.id("Skills"));
		 Select s1=new Select(e6);
		 s1.selectByVisibleText("Technical Skills");
			
			WebElement e7=driver.findElement(By.id("Country"));
			Select s2=new Select(e7);
			s2.selectByVisibleText("India");
				
			WebElement e8=driver.findElement(By.id("technicalskills"));
		   Select s3=new Select(e8);
			s3.selectByVisibleText("Core Java");
				
		
		WebElement e9=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		e9.sendKeys("Pune,Maharashtra,Pin-412207");
		
		WebElement e10=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		e10.sendKeys("Pune,Maharashtra,Pin-412207");
		
		WebElement e11=driver.findElement(By.xpath("//input[@id='Pincode']"));
		e11.sendKeys("412207");
		
		WebElement e12=driver.findElement(By.id("Relegion"));
		Select s4=new Select(e12);
		s4.selectByVisibleText("Hindu");
		
		WebElement e13=	driver.findElement(By.id("file"));
		
		e13.sendKeys("C://Users//Admin//Desktop//Deepali/Exception Handling-7 pages.pdf");
		
		Thread.sleep(3000); 
		
		
		
		WebElement check_box=driver.findElement(By.id("relocate"));
		
		check_box.click();
		
		//driver.navigate().refresh();
		
		WebElement submit_btn=driver.findElement(By.name("Submit"));
		submit_btn.click();
		 
		Thread.sleep(3000); 
		
		driver.switchTo().alert().accept();
		

	}

}
