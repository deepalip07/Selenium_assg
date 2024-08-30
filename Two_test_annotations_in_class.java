package selenium.TestNG;

import org.testng.annotations.Test;

public class Two_test_annotations_in_class 
{
   
	@Test
	public void login_mobile_no()
	{
		System.out.println("Login with mobile no..");
	}
	
	@Test
	public void login_email()
	{
		System.out.println("Login with email..");
	}
	
	
}
