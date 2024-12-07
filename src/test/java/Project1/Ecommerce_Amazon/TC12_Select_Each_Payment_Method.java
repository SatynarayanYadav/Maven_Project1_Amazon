package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//12. Verify user is able to select each payment method
public class TC12_Select_Each_Payment_Method extends LaunchQuit
{
   @Test
   public void Payment_Methods() throws EncryptedDocumentException, IOException, InterruptedException
   {
	      HomePage home1 = new HomePage(driver);
	   	  home1.hover(driver);
	   	  home1.signinlink();
	   	  
	   	  DDT exle = new DDT();
		  exle.UserDetails(driver);
		  
	   	  LoginPage login=new LoginPage(driver);
	   	  login.Username();
	   	  login.User_continue();
	   	  login.Password();
	   	  login.Passowrd_signin();
	   	  
	   	  home1.producte_search();
	   	
	   	  Product_detailPage Product_details = new Product_detailPage(driver);
	   	  Product_details.select3();
	   	  Product_details.product1(driver);
	   	  //Product_details.scroll(driver);
	   	  Product_details.BuyNowButton();
	   	  
	   	  Payment_MethodsPage Payment = new Payment_MethodsPage (driver);
	   	  Payment.scrollby(driver);
	   	  Payment.Radio_Credit_Debit();
	   	  Payment.Entercarddetails();
	   	  Payment.Iframehandle(driver);
	   	
	   	  
	   	  Payment.Radio_upi();
	   	  Payment.UPIEnter();
	   	 // Payment.Radio_EMI();
	   	  Payment.Cash_on_Delivery();
	   	  Payment.SelectBank(driver);
	   	  Payment.buttonclick();
	   	  
	   	  
   }
}
