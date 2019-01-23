package shivam123.shivam1234;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcustomer extends DriverScript {
@FindBy(xpath="//h1[contains(text(),'Add Customer')]")WebElement logoaddcustomer;
@FindBy(xpath="//label[@for='done']")WebElement backgroundcheckbutton;
@FindBy(xpath="//input[@id='fname']")WebElement firstnametextbox;
@FindBy(xpath="//input[@id='lname']")WebElement lastnametextbox;
@FindBy(xpath="//input[@id='email']")WebElement emailbox;
@FindBy(xpath="//textarea[@id='message']")WebElement enteryouraddressbox;
@FindBy(xpath="//input[@id='telephoneno']")WebElement phonebox;
@FindBy(xpath="//input[@value='Submit']")WebElement submitbutton;
@FindBy(xpath="//b[contains(text(),'Customer ID')]")WebElement custidlogo;
public addcustomer()
{
	PageFactory.initElements(driver, this);
}
	public boolean verifylogoaddcustomer()
	{
		return logoaddcustomer.isDisplayed();
	}
	
	public boolean verifybackgroundcheckbutton()
	{
		return  backgroundcheckbutton.isDisplayed();
	}
	
	public boolean verifyfirstnametextbox()
	{
		return firstnametextbox.isDisplayed();
	}
	
	public boolean verifylastnametextbox()
	{
		return lastnametextbox.isDisplayed();
	}
	
	
	public boolean verifyemailbox()
	{
		return emailbox.isDisplayed();
	}
	
	public boolean verifyenteryouraddressbox()
	{
		return enteryouraddressbox.isDisplayed();
	}
	public boolean verifyphonebox()
	{
		return phonebox.isDisplayed();
	}
	public String validateaddcustomerfunctionality(String FirstName,String LastName) throws InterruptedException
	{
		
		backgroundcheckbutton.click();	
		firstnametextbox.sendKeys("Sumit");
		lastnametextbox.sendKeys("Puri");
		emailbox.sendKeys("sumitp1010@yahoo.com");
		Helper.scrollPage(driver);
		System.out.println("------");
		enteryouraddressbox.sendKeys("12527 Grey Fox Lane Potomac Md 20854");
		phonebox.sendKeys("2404784179");
		submitbutton.click();
		Thread.sleep(5000);
		return custidlogo.getText();
	
	}
	public String validateaddcustomerfunctionality2(String FirstName,String LastName,String EM,String Add,String Mob) throws InterruptedException
	{
		backgroundcheckbutton.click();	
		firstnametextbox.sendKeys(FirstName);
		lastnametextbox.sendKeys(LastName);
		emailbox.sendKeys(EM);
		Helper.scrollPage(driver);
		System.out.println("------");
		enteryouraddressbox.sendKeys(Add);
		phonebox.sendKeys(Mob);
		submitbutton.click();
		Thread.sleep(5000);
		return custidlogo.getText();
	
	}
}

