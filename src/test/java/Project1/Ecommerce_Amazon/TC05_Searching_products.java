package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
// 5. Verify user search for products using its name like shoes
public class TC05_Searching_products extends LaunchQuit
{
   @Test
   public void SearchProduct() throws EncryptedDocumentException, IOException
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
   }
	
}
