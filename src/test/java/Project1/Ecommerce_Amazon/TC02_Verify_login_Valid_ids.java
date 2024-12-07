package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


//2. Verify login is successful with correct email and password.
public class TC02_Verify_login_Valid_ids extends LaunchQuit 
{
	
  @Test (retryAnalyzer = Project1.Ecommerce_Amazon.Retry_Analyzer.class)
  public void loginuser() throws EncryptedDocumentException, IOException 
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
	  
	  
  }
  
  
}
