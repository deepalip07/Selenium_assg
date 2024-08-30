package selenium.TestNG;

import org.testng.annotations.Test;

public class Use_invocationCount 
{
	 @Test(invocationCount=5)
     public void test1()
     {
    	 System.out.println("Test1");
     }
}
