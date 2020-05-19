package Constructor;

public class test1 {

	test1() {
		this.m1(10, 20);
		System.out.println("0 arg const");
	}

	test1(int a) {
		this.m1(20, 30);
		System.out.println("1 arg const");
	}

	test1(int a, int b) {
		System.out.println("2 arg const");
	}

	void m1(int a, int b) {

		System.out.println("m1 method");

	}

	public static void main(String[] args) {

		test1 t = new test1();
		test1 t1 = new test1(100,22);
	}

}
