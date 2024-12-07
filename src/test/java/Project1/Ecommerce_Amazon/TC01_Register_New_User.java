package Project1.Ecommerce_Amazon;

import org.testng.annotations.Test;

   //  1. Verify  new user can successfully register.
public class TC01_Register_New_User extends LaunchQuit
{
   @Test
   public void register_new_user()
   {
	   HomePage home1 = new HomePage(driver);
	   home1.hover(driver);
	   home1.rigisterlink();
	   
	   Create_AccountPage Acount = new Create_AccountPage(driver);
	   Acount.username();
	   Acount.Phoneno();
	   Acount.pws();
	   Acount.submit();
	   
	   home1.assert1(driver);
   }
   
}
