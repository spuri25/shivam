package shivam123.shivam1234;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper extends DriverScript {

	public static void scrollPage(WebDriver driver) 
	{
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("scroll(0,1000)");

	}

public static void OpenAutomationReport()
{
	try
	{
		
	
				driver.get("C:\\Framework\\com.gconnect\\gcReport\\Automation.html");
	}
	catch(Exception e)
	{
		System.out.println("Report not found.");
	}
}
}
