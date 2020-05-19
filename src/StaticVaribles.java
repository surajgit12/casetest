
public class StaticVaribles {

	
	static int a = 10;
	static int b =20;
	public static void main(String[] args) {
	 
		System.out.println(StaticVaribles.a);
		System.out.println(StaticVaribles.b);
		StaticVaribles t = new StaticVaribles();
		t.m1();
		StaticVaribles.m2();
	    	
	}
	void m1()
	{
		System.out.println(StaticVaribles.a);
		System.out.println(StaticVaribles.b);
	}
    static void m2()
    {
    	System.out.println(StaticVaribles.a);
		System.out.println(StaticVaribles.b);
	}
    }

