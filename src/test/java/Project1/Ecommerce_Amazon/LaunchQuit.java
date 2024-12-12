package Project1.Ecommerce_Amazon;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(Project1.Ecommerce_Amazon.ListenersLogicPage.class)
public class LaunchQuit  extends ListenersLogicPage
{
    
	@BeforeMethod 
	//@Parameters("browser")
	public void launch()//(String nameofthebrowser)
	{
		
		
			
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		/*if (nameofthebrowser.equals("Testing Chrome"))
		{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		(nameofthebrowser.equals("Testing firbox"))
		{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		if (nameofthebrowser.equals("Testing edge"))
		{
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}*/
	}
	
	@AfterMethod
	public void close()
	{
		//driver.quit();
	}
	
}
