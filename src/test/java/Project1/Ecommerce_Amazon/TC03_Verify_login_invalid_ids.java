package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//3. login fails with incorrect email or password
public class TC03_Verify_login_invalid_ids extends LaunchQuit

{
   @Test // (retryAnalyzer = Project1.Ecommerce_Amazon.Retry_Analyzer.class)
   public void failstologin() throws EncryptedDocumentException, IOException
   {
	   HomePage home1 = new HomePage(driver);
		  home1.hover(driver);
		  home1.signinlink();
		  

		  DDT exle = new DDT();
		  exle.UserDetails(driver);
		  
		  LoginPage login=new LoginPage(driver);
		  login.invalidUsername();
		  login.User_continue();
		  login.invalidPassword();
		  login.Passowrd_signin();
		  login.DiplayLabel();
		  
		  
		  
   }
}
