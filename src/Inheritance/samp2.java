package Inheritance;

public class samp2 extends  samp1 {
	int a =55;
	int b =66;
	
	samp2(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	int m1(int a, int b) {
		
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
		return b;
	}
	
	void m4() {
		System.out.println("child m4 method");
	}

	public static void main(String[] args) {
		

		samp2 t1 = new samp2(5,5);
		t1.m1(5, 6);
		
		
		
	}

}
