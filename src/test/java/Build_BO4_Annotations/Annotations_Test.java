package Build_BO4_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Test 
{
	@BeforeSuite
	public void beforeSuit_Test()
	{
		System.out.println("beforeSuit_Test---- 1");
	}
	@BeforeTest
	public void beforeTest_Test()
	{
		System.out.println("beforeTest_Test---- 2");
	}
	@BeforeClass
	public void beforeClass_Test()
	{
		System.out.println("beforeClass_Test---- 3");
	}
	@BeforeMethod
	public void beforeMethod_Test()
	{
		System.out.println("beforeMethod_Test---- 4");
	}
	@Test
	public void tc1_Test()
	{
		System.out.println("Testcase---- 5");
	}
	@AfterMethod
	public void afterMethod_Test()
	{
		System.out.println("afterMethod_Test---- 6");
	}
	@AfterClass
	public void afterClass_Test()
	{
		System.out.println("afterClass_Test---- 7");
	}
	@AfterTest
	public void afterTest_Test()
	{
		System.out.println("afterTest_Test---- 8");
	}
	@AfterSuite
	public void afterSuit_Test()
	{
		System.out.println("afterSuit_Test---- 10");
	}
}
