class X{}
class Emp{}
class Y{}
class S{}

public class Test11 {

	 void m1(X x , Emp e)
	 {
		 System.out.println("m1 method");
	 }
	 
	 static void m2(Y y ,S s)
	 {
		 System.out.println("m2 method");
	 }
	public static void main(String[] args) 
	 {
	     Test11 t =new Test11();
	     
	     t.m1(new X(),new Emp());
	      //X x = new X();
	      //Emp e = new Emp();
	      //t.m1(x, e);
	      
	     // t.m1(new X(),new Emp());
	      
	     // Y y = new Y();
	      //Student s = new Student();
	     // Test11.m2(y, s);
	      Test11.m2(new Y(),new S());
	 }

}
