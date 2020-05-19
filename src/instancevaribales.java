
public class instancevaribales {
	
	int a = 10; // instance variable
	int b =20;  // instance variable

	//  static method
	public static void main(String[] args) {
	// static area
		instancevaribales t = new instancevaribales();
		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();

	}
	// instance method
    void m1() // user definded method
    {
    	// Instance areas
    	System.out.println(a);

    	System.out.println(b);
    	
    	
    }
}
