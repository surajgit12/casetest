
public class Test1 {
              static     int a = 100;  /// instance varibales
               static   int b = 200;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   Test1 t = new Test1();
		   System.out.println(t.a);
          System.out.println(t.b);
              t.m1();
              
	}
    void m1() // user define me
    {  //instance area 
    	
    	System.out.println(a);
    	System.out.println(b);
    }
}
