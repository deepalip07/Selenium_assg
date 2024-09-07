package Data_provider_pkg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_1st_prg 
{
   @DataProvider(name="data1")
   public Object method1()
   {
	   return new Object[][] { {11},{12},{13},{14}};
   }
  	
   @Test(dataProvider="data1")
   
   public void testcase1(int num)
   {
	   int sum=num+100;
	   Reporter.log("Sum is", +sum);
   }
}
