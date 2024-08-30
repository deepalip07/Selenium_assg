package selenium.TestNG;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Timeout_parameter
{
	@Test(timeOut=2000)
	public void test()
	{
		System.out.println("test");
	}
}
