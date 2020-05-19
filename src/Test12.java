
public class Test12 {

	void m1()
	{
		System.out.println("m1 methods");
	}
	 Test12()
	 {
		 System.out.println("0 arg const");
	 }
	 Test12(int a)
	 {
		 System.out.println("1 arg coonst");
	 }
	public static void main(String[] args) 
	{
		Test12 t = new Test12();
		Test12 t1 = new Test12(10);
		t.m1();
		t1.m1();
 
	}

}
