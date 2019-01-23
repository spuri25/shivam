package shivamexcel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngexcel {
	////convert to excel
	WebDriver driver;
 @BeforeMethod
  public void preTest() {
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
	 
  }
 @Test(dataProvider="Yahoo")
 public void TestLoginFunction(String username, String Password) throws InterruptedException{
	 driver.findElement(By.id("login-username")).sendKeys(username);
driver.findElement(By.id("login-signin")).click();
Thread.sleep(5000);
driver.findElement(By.id("login-passwd")).sendKeys(Password);
driver.findElement(By.id("login-signin")).click();
String expected="Yahoo";
String actual= driver.getTitle();
Assert.assertEquals(actual, expected,"not matched");


 }
 @AfterMethod
 public void tearDown() throws InterruptedException
 {
	 Thread.sleep(5000);
	 driver.close();
 }
 @DataProvider(name="Yahoo")
 public Object[][] testData()
 {
	generics xl = new generics("C:\\workspace\\CopyoftestData1forSelenium.xls");
	int row = xl.GetRowCount(1);
	Object[][] data=new Object[row][2];
	for(int i=0; i<row; i++)
	{
		data[i][0]=xl.CellData1(1, 0, i);
		data[i][1]=xl.CellData2(1, 1, i);
		}

	
	return data;
	  
 }
}

