package Project1.Ecommerce_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Product_detailPage 

{
	WebDriver driver;
	  
	  @FindBy (xpath = "(//a[@class='a-link-normal s-no-outline']/div)[1]") // Select the product
	  WebElement select;
	  
	  @FindBy (xpath = "(//*[@class='a-price-whole'])[1]") // display the price
	  WebElement priceview;
	  
	  @FindBy (xpath = "//*[.='Product Description']") //  display the Description
	  WebElement Description;
	  
	  @FindBy (xpath = "(//*[.='Customer reviews'])[2]") //  display the Review
	  WebElement custreview;
	  
	  @FindBy(id="add-to-cart-button") // add to cart
	   WebElement card;
	   
	  @FindBy (id = "quantity") // select the product quantity
	  WebElement  Quantity;
	  
	  @FindBy (xpath = "//span[@id='submit.buy-now']") // Buynow button select
	  WebElement BuyNow; 
	  
	  @FindBy (xpath = "//div[@class='a-column a-span8']/h1")  // Assertion verify Checkout text
	  WebElement Verify_lable;
	  
	  public void select3()throws InterruptedException
	  {
		  Thread.sleep(3000);
		  select.click();  
		  Thread.sleep(3000);
		  
	  }
	  
	  public void product1(WebDriver driver) throws InterruptedException
	  {
	  	 Set <String> str =driver.getWindowHandles();
	  	  Iterator <String> It =   str.iterator();
	  	  String pare =  It.next();
	  	  String chil = It.next();
	  	  System.out.println(pare);
	  	  System.out.println(chil);
	  	  driver.switchTo().window(chil);
	  	  Thread.sleep(3000);
	  	 
	  }
	  
	  public void displayprice(WebDriver driver)
	  {
		  Assert.assertEquals(priceview.isDisplayed(), true);
		  System.out.println("Price displayed => " +priceview);
	  }
	  
	  public void displaydiscription()
	  {
		  Assert.assertEquals(Description.isDisplayed(), true);
		  System.out.println("Product Description displayed => " +Description);
	  }
	  
	  public void displaycustomerreview()
	  {
		  Assert.assertEquals(custreview.isDisplayed(), true);
		  System.out.println("Customer review "+custreview);
	  }
	  
	  public void addcard()
	   {
		   card.click();
	   }
	  public void SelectQantity() throws InterruptedException
	  {
		  Select Quan = new Select(Quantity);
		  Quan.selectByVisibleText("4");
		  Thread.sleep(2000);
	  }
	  
	  public void scroll(WebDriver driver) throws InterruptedException
	  {
		  Thread.sleep(2000);
		  JavascriptExecutor SUP = (JavascriptExecutor) driver;
		  SUP.executeScript("window.scrollBy(0,100)");
		  
	  }
	  
	  public void BuyNowButton() throws InterruptedException
	  {   
		  Thread.sleep(2000);
		  BuyNow.click();
	  }
	  public void Verify_text(WebDriver driver)
	  {
		  Assert.assertEquals(driver.getTitle(), "Select a Payment Method - Amazon.in Checkout" , "Lable is missmatch please check you are on checkout page or not");
	  }
	  public Product_detailPage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	  
	  
}
