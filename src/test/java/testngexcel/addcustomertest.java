package testngexcel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import shivam123.shivam1234.DriverScript;
import shivam123.shivam1234.Helper;
import shivam123.shivam1234.Homepage;
import shivam123.shivam1234.addcustomer;

public class addcustomertest extends DriverScript {
	public addcustomertest()
	{///initiates keyword constructor present in parent class
		super();
	}
@BeforeMethod
public void preTest()
{
	setUp();
}
@Test
public void validateAddCustomerfunction() throws InterruptedException
{
	
	Homepage hp = new Homepage();
	addcustomer ac = new addcustomer();
	hp.clickAddCustomer();
	String Actual =ac.validateaddcustomerfunctionality("Sumit", "Puri");
	System.out.println(Actual);
	Assert.assertEquals(Actual, "Customer ID");
}
@AfterMethod()
public void teardown()
{
	

	System.out.println("------");
}
}

