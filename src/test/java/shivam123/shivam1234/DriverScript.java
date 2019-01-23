package shivam123.shivam1234;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DriverScript {
	private static final String PURL = null;
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public DriverScript()
	{
		try
		{
		prop = new Properties();
		fis = new FileInputStream("C:\\Framework\\com.gconnect\\gcConfig\\config.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
	}
	@Test
	public static void setUp()
	{
		String browser = prop.getProperty("Browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("WebDriver.chrome.driver",prop.getProperty("chromepath"));
		driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("WebDriver.ie.driver",prop.getProperty("IEpath"));
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("PURL"));
	}
	}