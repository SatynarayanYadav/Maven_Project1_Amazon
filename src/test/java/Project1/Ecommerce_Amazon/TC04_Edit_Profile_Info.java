package Project1.Ecommerce_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
//4. Verify user can successfully edit their profile information
public class TC04_Edit_Profile_Info extends LaunchQuit
{
   @Test
   public void EditProfile() throws EncryptedDocumentException, IOException, InterruptedException
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
		  
		  home1.hover(driver);
		  home1.editprofile();
		  home1.viewPro();
		  
		  Your_ProfilePage Pro = new Your_ProfilePage(driver);
		  Pro.agegroup();
		  Pro.editbutton();
		  Pro.AgeSelect();
		  Pro.savebutton();
		  Pro.titlepage(driver);
		  
   }
}
