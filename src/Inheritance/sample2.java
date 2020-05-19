package Inheritance;

public class sample2 extends sample1 {
	
	sample2(){
		super(10);
		System.out.println("Child 0- args constructor");
	}
	
	void m1() {
		
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
	
		sample2 t = new sample2();
		t.m1();
		

	}

}
