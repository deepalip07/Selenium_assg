package Integration_Testing_Senario_Assertion;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class OrangeHRM_Login  extends Launch_n_quit 
{
	@Test(priority=1)
	public void login() throws EncryptedDocumentException, IOException
	{
 
		
	    //*******************Login Page*************************************************8
	    
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	    
	    WebElement username=driver.findElement(By.name("txtUsername"));	
	    username.sendKeys("Admin");
	    
        FileInputStream f1=new FileInputStream("C:\\eclipse\\Selenium_proj\\Data Driven Testing\\OrangeHRM.xlsx");
        Workbook w1=WorkbookFactory.create(f1);
        Sheet s1=w1.getSheet("Sheet1");
        
        Row r1=s1.getRow(1);
        Cell c1=r1.getCell(0);
        String password=c1.getStringCellValue();
        
        WebElement pwd=driver.findElement(By.name("txtPassword"));
        pwd.sendKeys(password);
        
        WebElement login_btn=driver.findElement(By.xpath("//button[@type='submit']"));
        
        login_btn.click();
        
    }
	
	
	    

	

}

