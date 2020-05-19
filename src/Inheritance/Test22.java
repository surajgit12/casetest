package Inheritance;

public class Test22 extends Test21 {

	void m3()
	{
		System.out.println("M3 method");
	}
	void m4()
	{
		System.out.println("M4 method");
	}
	public static void main(String[] args) {
		
		Test22 t = new Test22();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		
		Test21 t1 = new Test21();
		t1.m1();
		t1.m2();
	
	}

}
