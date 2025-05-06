package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Build_BO3_Hompage.Ddt_Test;

public class DataProvider_Test 
{

	
	@DataProvider(name="demo")
	public Object[][] getData()
	{
		Object[][] arr= {
				{"username","Password"},
				{"Admin","admin123"},
				{"Hemanth","SdetTrainer"}
				
		};
		return arr;
	}
	
	
	@Test(dataProvider="demo")
	public void Tester(String usn, String pwd)
	{
		System.out.println(usn+"  "+pwd);
		System.out.println("*****************");
	}
	
	@Test(dataProvider="demo2", dataProviderClass=Ddt_Test.class)
	public void Tester2(String usn, String pwd)
	{
		System.out.println(usn+"  "+pwd);
		System.out.println("------------------------------");
	}
}
