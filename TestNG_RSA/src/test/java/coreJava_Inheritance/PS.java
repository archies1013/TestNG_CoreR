package coreJava_Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis()
	{
		System.out.println("I am here");
	}
	
	
	@BeforeMethod
	public void beforerun()
	{
	System.out.println("Run me first");
	}
	
	@AfterMethod
	public void afterrun()
	{
	System.out.println("Run me last");
	}

}
