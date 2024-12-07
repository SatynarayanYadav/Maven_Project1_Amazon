package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

//Check if user is able to apply for coupon code while ordering the product

public class TC13_Coupon_Code_Apply extends LaunchQuit

{
   @Test
   public void CouponCodeadd() throws EncryptedDocumentException, IOException, InterruptedException
   {
	   HomePage home1 = new HomePage(driver);
	   	  home1.hover(driver);
	   	  home1.signinlink();
	   	  
	   	  DDT exle = new DDT();
		  exle.UserDetails(driver);
		  exle.coupondetails(driver);
		  
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
	   	  
	   	  Address.userCoupon1();
	   	  Address.direct_Coupon_verify_button(driver);
   }
}
