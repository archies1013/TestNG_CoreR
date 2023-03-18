package testNGBasics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC04 {

	@Test(groups= {"Smoke"})
	public void Groups2()
	{
		System.out.println("I am in group2");
	}
	
	@Test
	public void webloginhomeloan()
	{
		System.out.println("webloginhome");
	}
	
	@Test
	public void mobileloginhomeloan()
	{
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void loginAPIhomeloan()
	{
		System.out.println("APIloginhome");
	}
}
