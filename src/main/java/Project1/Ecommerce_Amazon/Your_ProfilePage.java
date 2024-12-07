package Project1.Ecommerce_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Your_ProfilePage
{
    WebDriver driver;
    
    @FindBy (xpath = "//div[.='Age group']")
    WebElement Age;
    
    @FindBy (xpath ="(//button[.='Edit'])")
    WebElement edit;
    
    @FindBy (xpath = "//button[.='30-34']")
    WebElement SelectAge;
    
    @FindBy (xpath ="(//span[.='Save'])[1]")
    WebElement save;

    public void agegroup()
    {
    	Age.click();  
    }
    public void editbutton()
    {
      edit.click();
    }
    public void AgeSelect() throws InterruptedException
    {
    	Thread.sleep(2000);
    	SelectAge.click();
    }
    
    public void savebutton()
    {
    	save.click();
    }
    public void titlepage(WebDriver driver)
    {
    	String Expectedtitle = "Profile Hub";
    	String actualTitle = driver.getTitle();
    	
    	Assert.assertEquals(Expectedtitle,actualTitle);
    }
    
    public Your_ProfilePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    

}