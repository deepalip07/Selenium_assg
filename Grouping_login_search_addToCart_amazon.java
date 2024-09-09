package Grouping_in_TestNG_concept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping_login_search_addToCart_amazon
{
	
    ChromeDriver driver=new ChromeDriver();
	
    @Test(priority=1,groups= {"smoke"})
	public void Launch() throws InterruptedException
	{
	    Thread.sleep(2000);
       driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    driver.manage().window().maximize();
	}
	    
	@Test(priority=2,groups= {"smoke"})
	public void login() throws EncryptedDocumentException, IOException
	{
		
	    WebElement u_name= driver.findElement(By.name("email"));
	    u_name.sendKeys("7972542126");
	     
	    WebElement continue_btn=driver.findElement(By.id("continue"));
	    continue_btn.click();
	     FileInputStream f1=new FileInputStream("C:\\eclipse\\Selenium_proj\\Data Driven Testing\\MyData.xlsx");
		
	    Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=   w1.getSheet("Sheet1"); 
		Row r1= s1.getRow(1);
		Cell c1=r1.getCell(0); 
		String pwd=c1.getStringCellValue(); 
		
		  WebElement password= driver.findElement(By.name("password"));
		    password.sendKeys(pwd);
	    
	    WebElement signin_btn= driver.findElement(By.id("signInSubmit"));
	    signin_btn.click();
	    
	   }
	
	   @Test(priority=3,groups= {"smoke"})
	   public void search_product() throws InterruptedException
	   {
		   WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
			  e1.sendKeys("shoe");
			  Thread.sleep(2000);
			  
			 List<WebElement> e2= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
			 
			 int count =e2.size();
			 System.out.println(count);
			  e2.get(2).click();
	   }
	   
	   @Test(priority=4,groups= {"smoke"})
	   public void add_to_cart_product()
	   {
		   WebElement e3 =driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		    e3.click();

		Set<String> s1=driver.getWindowHandles();
		
		Iterator i1=s1.iterator();
		
		String parentid=(String) i1.next();
		String childid=(String) i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		 
		WebElement e4=driver.findElement(By.id("add-to-cart-button"));
		
		e4.click();
	   }
	
	

}
