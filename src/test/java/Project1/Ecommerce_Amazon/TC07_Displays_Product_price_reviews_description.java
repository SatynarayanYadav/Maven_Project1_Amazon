package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//7. Verify product detail page displays all necessary information (price, reviews, description).

public class TC07_Displays_Product_price_reviews_description extends LaunchQuit
{
	  @Test
	  public void Display_Product() throws EncryptedDocumentException, IOException, InterruptedException
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
	  Product_details.displayprice(driver);
	  //Product_details.displaydiscription();
	  Product_details.displaycustomerreview();
	  
}
}
