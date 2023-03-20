package coreJava_Inheritance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS{
	//here PS = parent class 
	//PS1 = child class
	//only way to call the method is to create object of that class, but here by using word extends we are calling other class  method in this class
	//basically instead of public static void we trying to use TestNG
	
	/**constructor: when you create an object for any class a constructor will be called without parameter. there is a default 
	*constructor created in backend, but if you creating a class object with parameter, then you have to explicitly call that constructor that is called 
	*Parameterize constructor
	*/
	
	
	
	
	
	

	@Test
	public void testrun()
	{
		
		PS2 ps2=new PS2(3);//parameterize constructor
		int a=3;
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplyThree());
	}
}
