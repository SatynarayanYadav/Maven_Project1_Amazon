package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//8. Verify products can be sorted by relevance, price, rating, etc.
public class TC08_Sorted_by_price_rating extends LaunchQuit
{
   @Test
   public void sorting_the_product() throws EncryptedDocumentException, IOException, InterruptedException
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
	   	  
	      home1.SortDropdown();
	      home1.SortDropdown1();
	   	  
	   	  
   }
}
