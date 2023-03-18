package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC03 {

	
	@Test
	public void weblogincarloan()
	{
		System.out.println("weblogincar");
	}
	
	/**client req - run except mobile test case - skip only one test case from this class file-we will use "exclude and include" 
	 * in testngxml
	 * this will happen in real time when people ask you to run 1000tc or run specific modules only so in that you should quickly 
	 * write your testngxml file as per client requiremts 
	 * If you want to skip 30 tc while running give "tckeyword.*"
	 * We should have consistent name for testcases so that while automating it really helps us to 
	 * segregate and control the testcases accordingly
	 * testng2.xml = to run tc for package level - rightnow one package only - in real time there could be 5-6 packages 
	 * Package level run you can use when doing Regression Testing - by giving Package name in xml file
	 */
	@Test(groups= {"Smoke"})
	public void Groups1()
	{
		System.out.println("I am in group1");
	}
	
	@BeforeClass
	public void bfClass()
	{
		System.out.println("I will run first before any method in this TC03 class");
	}
	
	@AfterClass
	public void afClass()
	{
		System.out.println("I will run last after any method in this TC03 class");
	}
	
	
	
	@Test
	public void mobileSignIncarloan()
	{
		System.out.println("mobileSignIncar");
	}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("I will execute first before every method of TC03 class file");
	}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("I will execute first after every method of TC03 class file");
	}
	
	
	@Test
	public void mobileSignOutcarloan()
	{
		System.out.println("mobileSignOutcar");
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am always no 1");
	}
	
	
	@Test
	public void mobileLogincarloan()
	{
		System.out.println("mobileLogincar");
	}
	
	
	//client req - ask you to include only APIcarloan testcases--here you can use include instead of exclude
	@Test
	public void loginAPIcarloan()
	{
		System.out.println("APIlogincar");
	}
}
