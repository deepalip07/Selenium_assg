package Assertion_concept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_login_assertion 
{
	@Test()
	public void login() throws EncryptedDocumentException, IOException
	{
 
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
     
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
    
   // Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    
    WebElement search_field=driver.findElement(By.id("twotabsearchtextbox"));
    
    Assert.assertEquals(search_field.isDisplayed(),true);
    
    
    
	}
}
