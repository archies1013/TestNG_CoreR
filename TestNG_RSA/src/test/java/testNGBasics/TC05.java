package testNGBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;

public class TC05 {
		
/**Generally in tsetng methods run on Alphabetical order, but here we will see how to run without alphabetical order
 * Parameterization- this way "URL" will access its value from testngxml file. But if you want for every test for that you need to assign this
 *  parameter above every test case and then it in as String argument and print it then you can see this in output
 * 
 */
	
	@Parameters({"URL"})
	@Test
	public void Selenium(String username)
	{
		System.out.println("Cucumber");
		System.out.println(username);
	}
	
	@Test(dependsOnMethods= {"Selenium"})//this is helper attribute
	public void API()
	{
		System.out.println("RestAssured");
	}
	
	@Test(enabled = false)//this is helper attribute
	public void Appium()
	{
		System.out.println("Appium1");
	}
	
	@Test(timeOut = 4000)
	public void Jira()
	{
		System.out.println("Jira1");
	}
}
