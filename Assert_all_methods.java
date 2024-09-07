package Assertion_concept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_all_methods 
{

	@Test()
	
	public void test()
	{
		Assert.assertEquals(false, false);
		//Assert.assertEquals(false, true, "Sorry...");
		Assert.assertEquals(false, false, "Sorry...");
		
		Assert.assertEquals(123,123);
		//Assert.assertEquals(110, 111, "Sorry, not matching number...");
		
		Assert.assertEquals("Deepali","Deepali","Sorry,name not matching");
	//	Assert.assertEquals("Deepali","Patil","Sorry,name not matching");
		
		//Assert.assertEquals(2930.3484838,23444444.3333,"Sorry...");
		Assert.assertEquals(2930.3484838,2930.3484838);
	}
	
	
}
