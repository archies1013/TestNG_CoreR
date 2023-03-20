package coreJava_Inheritance;

public class PS2 extends PS3 {
	//what does this method do - if you send any number from this method, that will increment by 1 and send you back the number
	
	int a;//this is class variable

	public PS2(int a) //this is called Instance variable
	{
		super(a);//when you call this super keyword your parent class constructor is invoked
		this.a=a;//this word refers to the current class variable
	}


	public int increment() 
	{
		a=a+1;
		return a;
	
	}
	
	public int decrement() 
	{
		a=a-1;
		return a;
	
	}
		
	

}
