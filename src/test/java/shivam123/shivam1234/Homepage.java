package shivam123.shivam1234;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends DriverScript {


		
		///Repository
@FindBy(linkText="Guru99 telecom")WebElement logotelecom;
@FindBy(xpath="//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][contains(text(),'Add Customer')]")WebElement logoaddcustomer;
@FindBy(xpath="//div[@class='flex-item left']//div//h3//a[@href='assigntariffplantocustomer.php'][contains(text(),'Add Tariff Plan to Customer')]")WebElement logoaddtrariffplantocustomer;
@FindBy(xpath="//div[@class='flex-item right']//div//h3//a[@href='addtariffplans.php'][contains(text(),'Add Tariff Plan')]")WebElement logoaddtariffplan;
@FindBy(xpath="//div[@class='flex-item right']//div//h3//a[@href='billing.php'][contains(text(),'Pay Billing')]")WebElement logopaybilling;
	//Home Initialization
public Homepage()
{
	PageFactory.initElements(driver, this);
}
///page Actions
public boolean verifyTelecomLogo()
{
	return logotelecom.isDisplayed();
}
public boolean verifylogoAddCustomer()
{
	return logoaddcustomer.isDisplayed();	
}

public boolean verifylogoaddtrariffplantocustomer()
{
	return logoaddtrariffplantocustomer.isDisplayed();
}
public boolean verifylogoaddtariffplan()
{
	return logoaddtariffplan.isDisplayed();
}
public boolean logopaybilling()
{
	return logopaybilling.isDisplayed();
}
public void clickAddCustomer()
{
	logoaddcustomer.click();
}

}