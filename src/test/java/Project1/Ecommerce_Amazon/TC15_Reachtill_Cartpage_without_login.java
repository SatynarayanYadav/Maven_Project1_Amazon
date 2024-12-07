package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//15. Verify Reach till cart page without login in amazon application
public class TC15_Reachtill_Cartpage_without_login extends LaunchQuit
{
   @Test
   public void reachcartpage() throws EncryptedDocumentException, IOException
   {
	   HomePage home1 = new HomePage(driver);
	   home1.clickcart();
	   
	  
   }
}
