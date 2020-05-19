
public class testp {

	
	int a =10;
	static int b = 20;
	
	public static void main(String[] args) {
		
		testp t = new testp();
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.a =999;
		t.b =888;

		System.out.println(t.a);
		System.out.println(t.b);
		
	testp t1 = new testp();
	System.out.println(t1.a);
	System.out.println(t1.b);

	t.a =55;
	t.b =66;
	
	testp t2 = new testp();
	System.out.println(t2.a);
	System.out.println(t2.b);
	
		
	}

}
