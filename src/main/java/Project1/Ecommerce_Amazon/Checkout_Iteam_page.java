package Project1.Ecommerce_Amazon;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkout_Iteam_page extends DDT
{
  WebDriver driver;
  
  @FindBy (id = "addressChangeLinkId")    // change the addresh
  WebElement Addresh_Select;
  
  @FindBy (xpath = "//span[.='Meera Mohanty Soni']") // select the delivery address from the list
  WebElement List_address_select;
  
  @FindBy (css = "#shipToThisAddressButton") // click on use this address button
  WebElement add_adress_button;
  
  @FindBy (css = "[placeholder='Enter Code']") // Select coupan code filed
  WebElement coupons;
  
  @FindBy (xpath = "//span[@id='gcApplyButtonId']") // click on apply button to verify the coupon 
  WebElement VerifyCouponcode;
  
  @FindBy (css = "a[id='payChangeButtonId']") // change payment menthod or add
  WebElement Payotion;
  
  @FindBy (xpath = "//div[@id='revieworder']") // Verify the review order
  WebElement OrderReview;
  
  @FindBy (xpath = "//input[@name='ppw-claimCodeApplyPressed']") // verify 2nd coupon button without changing the address
  WebElement Coupontow;
  
  public void addreshlink(WebDriver driver)
  {
	  Addresh_Select.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  public void selectAddress() throws InterruptedException
  {
	  Thread.sleep(3000);
	  List_address_select.click();
	  Thread.sleep(1000);
  }
  public void add_button(WebDriver driver) throws InterruptedException
  {
	  JavascriptExecutor down = (JavascriptExecutor) driver;
	  down.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(2000);
	  add_adress_button.click();
	  Thread.sleep(10000);
  }
  
  public void userCoupon1() throws InterruptedException
  {
	  
	  coupons.sendKeys(Coupon1);
	  Thread.sleep(5000);
	  
  }
  public void verify_coupon()
  {
	  VerifyCouponcode.click();
  }
  
  public void selectpayment() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Payotion.click();
  }
  
  public void ReviewOrder(WebDriver driver) throws InterruptedException
  {
	  Thread.sleep(3000);
	  JavascriptExecutor down1 = (JavascriptExecutor) driver;
	  down1.executeScript("window.scrollBy(0,400)");
	  Assert.assertEquals(OrderReview.isDisplayed(), true , "OrderReview is not Diplayed at checkout page");
  }
  
  public void Verify_user_is_in_rightPage(WebDriver driver) throws InterruptedException
  {   
	  
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(), "Amazon.in Checkout" ,"user is not in payment chekout page");
  }
  
  public void direct_Coupon_verify_button(WebDriver driver) throws InterruptedException
  {
	  Thread.sleep(3000);
	  JavascriptExecutor down2 = (JavascriptExecutor) driver;
	  down2.executeScript("window.scrollBy(0,400)");
	  Coupontow.click();
  }
  
  public Checkout_Iteam_page (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
 
}
