
public class Test3 
{
   int a = 10;
   int b =20;
   static int c =30;
   static int d=40;
   
   void sum()
   {
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(Test3.c);
	     System.out.println(Test3.d);
   }
   static void mul()
   {
	   Test3 t = new Test3();
	   System.out.println(t.a);
	   System.out.println(t.b);
	   System.out.println(c);
	   System.out.println(d);
   }
  
	public static void main(String[] args) 
	{
	     Test3 t = new Test3();
	     t.sum();
	     t.mul();
	     Test3.mul();
       
	}

}
