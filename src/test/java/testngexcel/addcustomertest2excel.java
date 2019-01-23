package testngexcel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import shivam123.shivam1234.DriverScript;
import shivam123.shivam1234.Helper;
import shivam123.shivam1234.Homepage;
import shivam123.shivam1234.addcustomer;
import shivam123.shivam1234.generics;

public class addcustomertest2excel extends DriverScript {
	public addcustomertest2excel()
	{///initiates keyword constructor present in parent class
		super();
	}
@BeforeMethod
public void preTest()
{
	setUp();
}
@Test(dataProvider="addcustomer")
public void validateAddCustomerfunction(String FirstName,String LastName, String EM,String Add,String Mob) throws InterruptedException 
{
	Homepage hp = new Homepage();
	addcustomer ac = new addcustomer();
	hp.clickAddCustomer();
	String Actual =ac.validateaddcustomerfunctionality2(FirstName,LastName,EM,Add,Mob);
	System.out.println(Actual);
	Assert.assertEquals(Actual, "Customer ID");
}
@DataProvider(name="addcustomer")
public Object[][] testData()
{
	generics xl = new generics("C:\\Users\\t430\\Desktop\\Gconnectdataforlogosite.xls");
	int row = xl.GetRowCount(0);
	Object[][] data=new Object[row][5];
	for(int i=0; i<row; i++)
	{
		data[i][0]=xl.CellData1(0, 0, i);
		data[i][1]=xl.CellData2(0, 1, i);
		data[i][2]=xl.CellData2(0, 2, i);
		data[i][3]=xl.CellData2(0, 3, i);
		data[i][4]=xl.CellData2(0, 4, i);
		}

	
	return data;
	  
}
@AfterMethod()
public void teardown()
{
	driver.quit();
}
}

