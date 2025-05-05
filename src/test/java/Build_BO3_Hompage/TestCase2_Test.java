package Build_BO3_Hompage;

import org.testng.annotations.Test;

public class TestCase2_Test {

	@Test(priority=2,invocationCount=1,groups= {"Regression"})
	public void Hompage_Test()
	{
		System.out.println("Hompage_Test");
	}
	
	@Test(priority=3,invocationCount=1,groups= {"Regression"})
	public void Logout_Test()
	{
		System.out.println("Logout_Test");
	}

}
