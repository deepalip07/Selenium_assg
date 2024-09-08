package Integration_Testing_Senario_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_new_employee extends OrangeHRM_Login 
{
	
	 //*******************Home Page****************************************************
    
    @Test(priority=2)
    void add_emp() throws InterruptedException ,NoSuchElementException
    {
           WebElement search=driver.findElement(By.partialLinkText("Employee Management"));
    		search.click();
    		
    		
            Assert.assertEquals(driver.getTitle(), "Employee Management");
            
    		
    		WebElement emp_search_text_field=driver.findElement(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']"));
    		
    		Assert.assertEquals(emp_search_text_field.isDisplayed(),true);
    		
    		Thread.sleep(10000);
    		
    		   WebElement e1=driver.findElement(By.xpath("(//i[@class='material-icons'])[20]"));
    		      e1.click();
    }
  
    
    
   
	
     
    
    
    
    
    
    	
    	
    
    }
    
    


