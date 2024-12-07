package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC11_Entire_Checkout_Process extends LaunchQuit

{
   @Test
   public void checkout_process() throws EncryptedDocumentException, IOException, InterruptedException
   {
	      HomePage home1 = new HomePage(driver);
	   	  home1.hover(driver);
	   	  home1.signinlink();
	   	  
	   	  DDT exle = new DDT();
		  exle.UserDetails(driver);
		  exle.coupondetails(driver);
		  exle.CardDetail(driver);
		  
	   	  LoginPage login=new LoginPage(driver);
	   	  login.Username();
	   	  login.User_continue();
	   	  login.Password();
	   	  login.Passowrd_signin();
	   	  
	   	  home1.producte_search();
	   	
	   	  Product_detailPage Product_details = new Product_detailPage(driver);
	   	  Product_details.select3();
	   	  Product_details.product1(driver);
	   	  Product_details.BuyNowButton();
	   	  Product_details.Verify_text(driver);
	   	  
	   	  Checkout_Iteam_page Address =new Checkout_Iteam_page(driver);	 
	   	  Address.addreshlink(driver);
	   	  Address.selectAddress();
	   	  Address.add_button(driver);
	   	  Address.userCoupon1();
	   	  Address.verify_coupon();
	   	  Address.selectpayment();
	   	  
	   	  Payment_MethodsPage Payment = new Payment_MethodsPage (driver);
	   	  Payment.scrollby(driver);
	   	  Payment.Radio_Credit_Debit();
	   	  Payment.Entercarddetails();
	   	  Payment.Iframehandle(driver);
	      Payment.Cash_on_Delivery();
	   	  Payment.buttonclick();
	   	  
	   	  Address.ReviewOrder(driver);
	   	  Address.Verify_user_is_in_rightPage(driver);
   }
}
