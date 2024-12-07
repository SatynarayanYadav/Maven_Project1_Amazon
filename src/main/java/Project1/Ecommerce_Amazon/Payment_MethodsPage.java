package Project1.Ecommerce_Amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_MethodsPage extends DDT

{
   WebDriver driver;
   
   @FindBy (xpath = "//input[@Value = 'SelectableAddCreditCard']") // select radio button for Credit_Debit card add
   WebElement Credit_Debit;
   
   @FindBy (xpath = "(//a[.='Enter card details'])[1]") //Enter card details link clik
   WebElement card_details;
   
   @FindBy (xpath = "//iframe[@name='ApxSecureIframe']") // Handle the iframe element
   WebElement iframe;
   
   @FindBy (xpath = "//input[@name='addCreditCardNumber']") // Enter card number in the box
   WebElement cardnumber;
   
   @FindBy (xpath = "//input[@name='ppw-accountHolderName']") // Enter the user name
   WebElement UserName;
   
   @FindBy (xpath = "//select[@name='ppw-expirationDate_month']")// select Expiry date
   WebElement selectdate;
   
   @FindBy (xpath = "//select[@name='ppw-expirationDate_year']")// Select expiry year
   WebElement selectyear;
   
   @FindBy (xpath = "(//span[.='Enter card details'])[1]") // submit the card details
   WebElement submit;
 
   @FindBy (xpath = "//button[.='Cancel']")  // cancle button in i frame
   WebElement closeIframe;
         
   //@FindBy (xpath = "//div[@class='a-radio a-spacing-top-mini']/label/input")// select radio button for NetBanking
  // WebElement Netbanking;
   
   @FindBy (xpath = "//select[@name='ppw-bankSelection_dropdown']") // Select bank name from dropdown
   WebElement Dropdown;
   
   @FindBy (xpath = "(//div[@class='a-container content-container'])") //cleck out said
   WebElement Outsaid;
   
   @FindBy (xpath = "(//div[@class='a-row a-spacing-none'])[1]") // select radio button for UPI Apps
   WebElement UPI;
   
   @FindBy (xpath = "//input[@name='__sif_encryptedVPA_collect']") // Enter UPI id in the box
   WebElement enterUpi;
   
   @FindBy (xpath = "//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']") // verify button for UPI
   WebElement Verifybutton;
   
   @FindBy (xpath = "//div[@class='a-section a-spacing-none']")// clic out side
   WebElement outsaid;
   
   @FindBy (xpath = "(//span[.='Select EMI options'])[4]") // Select radio button for EMI option
   WebElement EMI;
   
   @FindBy (xpath = "(//span[.='Cash on Delivery/Pay on Delivery'])[3]") //Select radio button for COD
   WebElement CashOD;
   
   @FindBy (xpath = "//span[@id='orderSummaryPrimaryActionBtn']") // click on use this payment method
   WebElement button;
   
   public void Radio_Credit_Debit() throws InterruptedException
   {
	   Credit_Debit.click();
	   Thread.sleep(3000);
   }
   public void Entercarddetails()
   {
	   card_details.click();
   }
   public void Iframehandle(WebDriver driver) throws InterruptedException
   {
	   driver.switchTo().frame(iframe);
	   Thread.sleep(3000);
	   cardnumber.sendKeys(DebitCard1);
	   Thread.sleep(2000);
	   UserName.sendKeys("Test Yadav");
	   Thread.sleep(2000);
	   Select date = new Select(selectdate);
	   date.selectByVisibleText("04");
	   Thread.sleep(1000);
	   Select year = new Select(selectyear);
	   year.selectByVisibleText("2027");
	   submit.click();
	   Thread.sleep(2000);
	   closeIframe.click();
	   driver.switchTo().defaultContent();
	   Thread.sleep(3000);
   }
  /* public void Radio_NetBanking()
   {
	   Netbanking.click();
   }
   */
   
   public void SelectBank(WebDriver driver) throws InterruptedException
   {
	   Select bank = new Select(Dropdown);
	   bank.selectByVisibleText("ICICI Bank");
	   Thread.sleep(3000);
	   //Outsaid.click();
   }
   public void Radio_upi()
   {
	   UPI.click();
   }
   public void UPIEnter() throws InterruptedException
   {
	   enterUpi.sendKeys("12345677@axis");
	   Thread.sleep(2000);
	   //Verifybutton.click();
	  
   }
   public void Radio_EMI()
   {
	   EMI.click();
   }
   public void Cash_on_Delivery() throws InterruptedException
   { 
	   Thread.sleep(2000);
	   CashOD.click();
   }
   
   public void buttonclick() throws InterruptedException
   {
	   Thread.sleep(2000);
	   button.click();
   }
   public void scrollby(WebDriver driver) throws InterruptedException
	  {
		  Thread.sleep(2000);
		  JavascriptExecutor SUP = (JavascriptExecutor) driver;
		  SUP.executeScript("window.scrollBy(0,200)");
	  }  
   
   public Payment_MethodsPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
