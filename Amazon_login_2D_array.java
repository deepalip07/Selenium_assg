package Data_provider_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_login_2D_array 
{
	@Test(dataProvider="login_details")
	public void Am_login(String un,String pwd)
	{
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
     
    WebElement u_name= driver.findElement(By.name("email"));
    u_name.sendKeys(un);
     
    WebElement continue_btn=driver.findElement(By.id("continue"));
    continue_btn.click();
    
    WebElement password= driver.findElement(By.name("password"));
    password.sendKeys(pwd);
    
    
    WebElement signin_btn= driver.findElement(By.id("signInSubmit"));
    signin_btn.click();
	}
	
	@DataProvider(name="login_details")
	
	public Object[][] method1()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="9292929292";
		data[0][1]="Test@123";
		
		data[1][0]="8281726363";
		data[1][1]="Test@126";
		
		data[2][0]="5611272727";
		data[2][1]="Test@199";
		return data;
		
	}
	
	
	
	
}
