package Inheritance;

public class Test26 extends Test25 {

	
	Test26()
	{  
		this(50);
		System.out.println("child 0 arg constructor");
	}
	Test26(int a)
	{ 
		
	System.out.println("Parementerised child constructor");
	}
	
	public static void main(String[] args)
	{
		
		new Test26();
	}

}
