
public class Static {
 static int a =100;
 
	public static void main(String[] args) {
		System.out.println(Static.a); // class name
		System.out.println(a); // direct access
		Static t = new Static();
	    System.out.println(t.a);

	}

}
