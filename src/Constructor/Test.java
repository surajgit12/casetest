package Constructor;

public class Test {
	
	int age;
	String name;

	void m1(int age, String name) { // instance method
		this.age = age;
		this.name = name;
		
		System.out.println("M1 Method");
	}
	
	Test(int age, String name){
	age =10;
	name = "Suraj";
	 
		System.out.println("0-arg construcor");
	}
	Test(int a)
	{
		System.out.println("1 -arg const");
	}
	public static void main(String[] args) {
	
		Test t = new Test(10,"syr");
		t.m1(10, "Suraj");
		
	}

}
