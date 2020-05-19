package PolyMorphism;

public class Test1 {
	
	
	// Method overloading
	void m1(int a)
	{
		System.out.println("M1 method");
	 }
	void m1(int a, int b)
	{
		System.out.println("M1 method with two arg---->"+(a+b));
	}

	
  void m1(char ch)
  {
	  System.out.println("m1 char method--->" +'S');
  }
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.m1(10);
	    t.m1(10, 20); 
	    t.m1('a');
		

	}

}
