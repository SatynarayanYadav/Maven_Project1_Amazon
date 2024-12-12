package Project1.Ecommerce_Amazon;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage 
{
	WebDriver driver;
    @FindBy (xpath = "//span[@class='nav-line-2 ']")
    WebElement Accountaddlist;
   
    @FindBy (xpath = "(//a[.='Start here.'])[1]")
    WebElement starthere;
    
    @FindBy (xpath = "(//span[.='Sign in'])[1]")
    WebElement signin;
    
    @FindBy (xpath = "//i[@aria-label='Amazon']") // Amazon Lable to verify 
    WebElement display;
    
    @FindBy (xpath = "//button[.='Manage Profiles']")  // Manage User Profile link
    WebElement prfile;
    
    @FindBy (xpath = "//a[.='View']")   // View link for user profile
    WebElement viewprofile;
    
    @FindBy (id = "twotabsearchtextbox")  // Searchbox to search the producte
    WebElement search;
    
    @FindBy (xpath = "//span[. = \"Men's Sneakers\"]") // Search product with catagory
    WebElement Catagory;
    
    
    @FindBy (id="p_36/range-slider_slider-item_upper-bound-slider") // Price filter
    WebElement Price;
    
    @FindBy (xpath = "//span[@class='a-button a-button-base']") // Go button for price filter
    WebElement Gobutton;
    
    @FindBy (xpath = "//select[@id='s-result-sort-select']") // products can be sorted by relevance, price, rating, etc.
    WebElement dropdown;
    
    @FindBy (xpath = "//a[@id='nav-cart']") // Select the cart 
    WebElement cartbutton;
    
    public void hover(WebDriver driver)
    {
    	Actions a1 = new Actions(driver);
    	a1.moveToElement(Accountaddlist).perform();
    			
    }
    
    public void rigisterlink()
    {
    	starthere.click();
    }
    
    public void signinlink()
    {
    	signin.click();
    }
    
    public void assert1(WebDriver driver)
    {
    	
    	Assert.assertEquals(display.isDisplayed(), true);
    	
    }
    
    public void editprofile() throws InterruptedException
    {
    	prfile.click();
    	Thread.sleep(2000);
    	
    }
    
    public void viewPro()
    {
    	viewprofile.click();
    }
    
    public void producte_search()
    {
    	search.sendKeys("Shoes" + Keys.ENTER);
    }
    
    public void Search_Catagory(WebDriver driver) throws InterruptedException
    {
    	Catagory.click();
    	Thread.sleep(500);
    	
    }
    
    public void price_range(WebDriver driver) throws InterruptedException, AWTException
    {
    	
    	Point  P1 = Price.getLocation();
    	int x = P1.getX();
    	int y = P1.getY();
    
    
    	JavascriptExecutor scroll = (JavascriptExecutor) driver;
    	scroll.executeScript("window.scrollBy(0,"+(y)+")");
    	Thread.sleep(90);
    	//Price.click();
    	
    	Actions Ac = new Actions(driver);
    	Ac.doubleClick(Price).perform();
    			
    	
    	Robot r1 = new Robot();
    	r1.keyPress(KeyEvent.VK_TAB);
		for(int i=0;i<=100;i++)
		{
			Thread.sleep(100);
			r1.keyPress(KeyEvent.VK_LEFT);
		}
    	
    	
    }
    
    public void buttonGo()
    {
    	Gobutton.click();
    }
    
    public void SortDropdown() throws InterruptedException
    {
    	Select drop = new Select(dropdown);
    	drop.selectByValue("price-asc-rank");
    	Thread.sleep(5000);
    	
    }
    public void SortDropdown1() throws InterruptedException
    {
    	Select drop = new Select(dropdown);
    	drop.selectByValue("review-rank");
    }
    
    public void clickcart()
    {
    	cartbutton.click();
    }
    public HomePage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
}
