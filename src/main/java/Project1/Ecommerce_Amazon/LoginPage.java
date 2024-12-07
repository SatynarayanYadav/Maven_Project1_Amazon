package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends DDT
{
	
	static WebDriver driver;
	
	//step 1
	@FindBy(id="ap_email")  // username filed
	WebElement username_tf;
	
	@FindBy(id="continue")  // Continue button
	WebElement continue_button;
	
	@FindBy(name="password")   // password filed
	WebElement password_tf;
	
	@FindBy(id="auth-signin-button")  // signin button
	WebElement signin_button;
	
	@FindBy(xpath = "//i[@aria-label=\"Amazon\"]")  // test lable Amazon
	WebElement Label;
	
	//step 2
	
	public void Username() throws EncryptedDocumentException, IOException
	{
		
		  username_tf.sendKeys(username1_valid);	  
	}	  
   public void Password() throws EncryptedDocumentException, IOException	
   {
	        
		  password_tf.sendKeys(Password1_valid);
		  
	}
	
   public void invalidUsername() 
   {
	   username_tf.sendKeys(username2_invalid);;
   }
   public void invalidPassword() 
   {
	   password_tf.sendKeys(Password2_invalid);
   }
	
	public void User_continue()
	{
		continue_button.click();
			
	}
	
	public void Passowrd_signin()
	{
		signin_button.click();
		
	}
	
	public void DiplayLabel()
	{
		Assert.assertEquals(Label.isDisplayed(), true);
	}
	//step 3
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
}
