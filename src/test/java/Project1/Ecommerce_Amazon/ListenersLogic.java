package Project1.Ecommerce_Amazon;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener
{


	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	

	@Override
	public void onFinish(ITestContext context) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
  
}
