package testscript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_test;
import generic.Excel_sheet;
import pomscript.POM;

public class Runner extends Base_test
{
	@Test(dataProvider = "testdata")
	public void ru( String d1, String d2)
	{
	POM p=new POM(driver);
	p.undata(d1);
	p.pwddata( d2);
	p.log();
	Assert.fail();
	}
	
	@DataProvider(name="testdata")
	public Object[][] createData1()
	{
		return new Object[][] 
				{
			{"8431000296","sangam@73"},
			{"sagar","4567"},
		
	            };
		

	}
}
