package Project1.Ecommerce_Amazon;

import org.testng.annotations.Test;

public class Register_New_User_TC01 extends LaunchQuit
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
   }
   
}
