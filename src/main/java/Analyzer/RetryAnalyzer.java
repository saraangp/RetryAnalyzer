package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{     // implement IRetryAnalyzer interface

	int counter =0;      
	int retryLimit=3;     // give 3 chances for failure test cases
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
