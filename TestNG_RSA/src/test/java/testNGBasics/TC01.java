package testNGBasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC01 {

	//public static void main(String[] args) {
		
		//Java Compiler
/**public static void main(String[] args){
 * }
 * = bec of this line of code your test will run on JavaCompiler 
 * Now TestNG act as a JavaCompiler for you, so if you can incorporate testNG Framework in testNG library into your testcases 
 * so you need not depends upon JavaCompile. TestNG itself act as a JavaCompiler and execute all your test cases.
 * Without this above line you cannot run and compile any Java program, you need this main method in Java to execute
 * But still you need Java in backend but for front end if you testNg you dont need Java for frontend
 */
		//TestNg
		/**Create one method first that is=
		 * @Test
		 * public void demo(){
		 * "write code"
		 * }
		 * This is above is method syntax of TestNG, which has a public is a access modifier and void is a return type
		 * and it testNG need all test case execution in method.
		 * @Test = is one of the annotation in testNG library which will recognize the method which immediately 
		 * followed after this annotation as test case and it will run run the program even if you don't give the
		 * public static void main(String[] args)
		 * 
		 */
	//}
	
	@AfterTest
	public void after()
	{
		System.out.println("I will execute last");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am always run last");
	}
	
	@Test(groups= {"Smoke"})
	public void Groups3()
	{
		System.out.println("I am in group3");
	}
	
	@Test
	public void demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void demoBye()
	{
		System.out.println("Bye");
	}
	
	@Test(dataProvider = "getData")
	public void French(String username, String password)
	{
		System.out.println("Bongo");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		/**1 combination  = username and password = good credit history
		 * 2 combination  = username and password = no credit history
		 * 3 combination  = username and password = fradalant credit history
		 * here data sets=3 and datavalues = 2
		 * Object[][] data=new Object[3]datasets are row [2]datavalues are column;
		 * arrays always starts with 0 index
		 * each data set  = 1 row
		 * each data set value  = 1 col
		 * we have set three data sets, that means our test should run three times with three different data sets and values
		 */
		
		Object[][] data=new Object[3][2];//we have initialize data variable in three rows as we have three combination datasets 
		//1st Set Data: good credit history
		data[0][0]="firstsetusername";
		data[0][1]="firstsetpassword";//columns in the row are nothing but the values of that particular combination(row)
		
		//2nd Data Set = no credit history
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		
		//3rd Data Set = froudalant credit history
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		return data;//always check return type in method, now we need to catch this data in our testcases

	}
}
