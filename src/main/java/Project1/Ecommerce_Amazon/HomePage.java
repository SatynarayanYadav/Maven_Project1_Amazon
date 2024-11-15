package Project1.Ecommerce_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
    @FindBy (xpath = "//span[@class='nav-line-2 ']")
    WebElement Accountaddlist;
   
    @FindBy (xpath = "(//a[.='Start here.'])[1]")
    WebElement starthere;
    
    
    public void hover(WebDriver driver)
    {
    	Actions a1 = new Actions(driver);
    	a1.moveToElement(Accountaddlist).perform();
    			
    }
    
    public void rigisterlink()
    {
    	starthere.click();
    }
    
    public HomePage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
}
