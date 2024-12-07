package Project1.Ecommerce_Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer 
{
	int firstcount = 0;
	int retrycount = 1;

	@Override
	public boolean retry(ITestResult result) 
	{
		if (firstcount<retrycount)
		{
			firstcount++;
			return true;
		}
		
		return false;
	}
   
}
