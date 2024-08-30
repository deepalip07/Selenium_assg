
package selenium.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Two
{
     @BeforeSuite
     public void bs1()
     {
    	 System.out.println("Bofore suite1..");
     }
     
     @Test
     public void test1()
     {
    	 System.out.println("Test1");
     }
     
     @Test
     public void test2()
     {
    	 System.out.println("Test2");
     }
     
     @Test
     public void test3()
     {
    	 System.out.println("Test3");
     }
     
     @AfterMethod
     public void am()
     {
    	 System.out.println("After method..");
     }
     
     @AfterSuite
     public void as1()
     {
    	 System.out.println("After suite1..");
     }
	
	
	
}
