package Inheritance;

public class Test24 extends Test23 {
  
	void m1()
	{
		System.out.println("Cild M1 method");
	}
	void m2() 
	{
		this.m1();
		super.m1();
	}
	
	public static void main(String[] args) {
		
		Test24 t = new Test24();
		t.m2();
		
	}

}
 