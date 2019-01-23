package testngexcel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import shivam123.shivam1234.DriverScript;
import shivam123.shivam1234.Homepage;

public class testcaseval extends DriverScript{
	public testcaseval()
	{///initiates keyword constructor present in parent class
		super();
	}
@BeforeMethod
public void preTest()
{
	setUp();
}

 @Test
 public void TestVerifyHompagelinks()
 {
	 
	 Homepage hp = new Homepage();
	 
	boolean flash=hp.verifylogoaddtariffplan();
	System.out.println(flash);
	Assert.assertTrue(hp.verifylogoAddCustomer());
	Assert.assertTrue(hp.verifylogoaddtrariffplantocustomer());
	Assert.assertTrue(hp.verifyTelecomLogo());
	Assert.assertTrue(hp.logopaybilling());
	
	
 }
 @AfterMethod
 public void teardown()
 {
	 driver.close();
 }
}
