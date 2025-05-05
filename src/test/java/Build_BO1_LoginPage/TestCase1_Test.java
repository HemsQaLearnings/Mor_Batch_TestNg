package Build_BO1_LoginPage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1_Test 
{

	@Test(priority=0, invocationCount=1,groups= { "smoke","Regression"})
	public void signUP_Test()
	{
		System.out.println("SignUp_Test");
		Reporter.log("SignUp_Test");
		//To fail the Testcase forcefully 
		//Assert.assertTrue(false);
	}
	
	@Test(priority=1,invocationCount=1,groups= {"functionalTesting"})
	public void login_Test()
	{
		System.out.println("login_Test");
		Reporter.log("login_Test");
		///Assert.assertTrue(false);
	}
	
	
}
