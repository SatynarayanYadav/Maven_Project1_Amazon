package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//10. Verify updating item quantities and removing items from the cart.
public class TC10_Cart_Item_quantities_and_removing_items extends LaunchQuit

{
   @Test
   public void Iteam_count_remove() throws InterruptedException, EncryptedDocumentException, IOException
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
	   	  Product_details.scroll(driver);
	   	  Product_details.SelectQantity();
	   	  Product_details.addcard();
	   	  
	   	Shopping_CartPage cart = new Shopping_CartPage(driver);  
	   	cart.GoCart(driver);
	   	cart.deleteitem();
   }
}
