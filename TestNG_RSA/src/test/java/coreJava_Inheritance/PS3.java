package coreJava_Inheritance;

public class PS3 {
	//what does this method do - if you send any number from this method, that will increment by 1 and send you back the number
	
	int a;//this is class variable

	public PS3(int a) {
		this.a=a;
	}

	public int multiplyTwo() 
	{
		a=a*2;
		return a;
	
	}
	
	public int multiplyThree() 
	{
		a=a*3;
		return a;
	
	}
		
	

}
