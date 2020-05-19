package Inheritance;

public class Test28 extends Test27 {
	{
		System.out.println("child instance block");
	}
  Test28()
  {
	  System.out.println("child 0 arg constructor");
  }
   static
   {
	   System.out.println("child static block");
   }
	public static void main(String[] args) {
		
		new Test28();
		new Test28();
	}

}
