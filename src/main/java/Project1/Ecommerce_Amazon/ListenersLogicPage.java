package Project1.Ecommerce_Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersLogicPage implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test cases executed by Itestlistener and pass  ");
		TakesScreenshot screen = (TakesScreenshot) driver;
		File Source =  screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\satya\\eclipse-workspace\\Ecommerce_Amazon\\src\\test\\java\\Project1\\Ecommerce_Amazon\\Pass\\Screenshort_Pass "+Math.random()+".png");
		try {
			FileHandler.copy(Source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test cases executed by Itestlistener and fail  ");
		TakesScreenshot screen = (TakesScreenshot) driver;
		File Source =  screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\satya\\eclipse-workspace\\Ecommerce_Amazon\\src\\test\\java\\Project1\\Ecommerce_Amazon\\Fail\\Screenshort_Fail "+Math.random()+".png");
		try {
			FileHandler.copy(Source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	@Override
	public void onFinish(ITestContext context) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
  
}
