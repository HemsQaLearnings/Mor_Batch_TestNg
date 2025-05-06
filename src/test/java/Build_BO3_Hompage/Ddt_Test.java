package Build_BO3_Hompage;

import org.testng.annotations.DataProvider;

public class Ddt_Test {

	
	@DataProvider(name="demo2")
	public Object[][] getData()
	{
		Object[][] arr= {
				{"username","Password"},
				{"Amrutha","admin123"},
				{"Modi","India"}
				
		};
		return arr;
	}
}
