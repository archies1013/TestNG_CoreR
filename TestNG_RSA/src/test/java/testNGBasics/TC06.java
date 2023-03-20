package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;

public class TC06 {
		

	
	
	@Test
	@Parameters({"url","APIKey"})
	public void GitHub(@Optional("Chrome")String urname, String APIkey)
	{
		System.out.println("GitHub1");
		System.out.println(urname);
		System.out.println(APIkey);
	}
	
	@Test
	public void Hi()
	{
		System.out.println("Bye123");
		Assert.assertTrue(false);
	}
}
