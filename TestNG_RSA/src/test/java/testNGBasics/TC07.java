package testNGBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;

public class TC07 {
		

	
	
	@Parameters({"key"})
	@Test
	public void Git(String key)
	{
		System.out.println("Git1");
		System.out.println(key);
	}
}
