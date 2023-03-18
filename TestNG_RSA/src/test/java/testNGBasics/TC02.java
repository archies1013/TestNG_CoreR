package testNGBasics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC02 {

	
	@Test(groups= {"Smoke"})
	public void demoGood()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I will execute first");
	}
	
}
