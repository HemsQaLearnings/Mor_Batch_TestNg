package Parameterization;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class TestCase4_Test extends BaseClass
{

	@Test
	public void login_test() throws InterruptedException
	{
		String dashboard_txt = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
		if(dashboard_txt.equalsIgnoreCase("Dashboard"))
		{
			System.out.println("Yes Dashboard is present, You are  in the home page");
		}
		
		
	}
}
