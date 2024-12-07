package Project1.Ecommerce_Amazon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Shopping_CartPage 

{
   WebDriver driver;
   
   @FindBy (xpath = "//span[@id='sw-gtc']/span/a") // Go to card page
   WebElement go_to_cart;
   
   @FindBy (xpath = "(//input[@Value='Delete'])[1]")
   WebElement delete;
   
   
   public void GoCart(WebDriver driver) throws InterruptedException
   {
	   go_to_cart.click();
	   Thread.sleep(2000);
	   Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart" , "Your is not in shopping cart page please check");
   }
   
   public void deleteitem()
   {
	   delete.click();
   }
   
   
   public Shopping_CartPage(WebDriver driver)
   
   {
   PageFactory.initElements(driver, this);
   }
}
