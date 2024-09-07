package Data_provider_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pass_5_inputs_Google 
{

	@DataProvider(name="data1")
	public Object method1()
	{
		return new Object[][] { {"India"},{"sachin"},{"testng"},{"grotechminds"},{"pune"} };
	}
	
	@Test(dataProvider="data1")
	
	public void tescase1(String google_input)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement search_text_field=driver.findElement(By.name("q"));
		
		search_text_field.sendKeys(google_input);
		search_text_field.sendKeys(Keys.ENTER);
		driver.quit();
	}
	
	
}
