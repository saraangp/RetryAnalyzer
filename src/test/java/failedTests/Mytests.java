package failedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytests {

	// failed test cases 
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)  // RetryAnalyzer is connected with test method 
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false,true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
