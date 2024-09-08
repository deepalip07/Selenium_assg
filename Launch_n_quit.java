package Integration_Testing_Senario_Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Launch_n_quit 
{
	ChromeDriver driver=new ChromeDriver();

	@BeforeMethod()
	
	public void Launch()
	{
	
    driver.get("https://deepalip-trials714.orangehrmlive.com/");
    driver.manage().window().maximize();
	}
    
}
