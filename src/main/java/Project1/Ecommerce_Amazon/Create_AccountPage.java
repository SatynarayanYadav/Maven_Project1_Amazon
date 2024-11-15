package Project1.Ecommerce_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_AccountPage 
{
    WebDriver driver;
    @FindBy (id="ap_customer_name")
    WebElement YourName;
    
    @FindBy (id="ap_phone_number")
    WebElement MobileNo;
    
    @FindBy (id="ap_password")
    WebElement Password;
    
    @FindBy (id="continue")
    WebElement continuebutton;
    
    public void username()
    {
    	YourName.sendKeys("TestAmazon");
    }
    public void Phoneno()
    {
    	MobileNo.sendKeys("7795826674");
    }
    public void pws()
    {
    	Password.sendKeys("Test@Amazon");
    }
    public void submit()
    {
    	continuebutton.click();
    }
    public Create_AccountPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
}
