package Project1.Ecommerce_Amazon;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//6. Verify that searching with filters (e.g., category, price range) yields accurate results.

public class TC06_searching_with_filter_category extends LaunchQuit
{
	@Test
	public void Search_Filter_Category() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
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
	  
	  //home1.Search_Catagory(driver);
	  
	  home1.price_range(driver);
	  
	  //home1.buttonGo();
}
}