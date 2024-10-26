public class StaticEx {
	
	
	int a;
	static int b;
	
	StaticEx()
	{
		a=0;
	
	}
	
	static
	{
		
	}
	
	 static void show2()
	{
			System.out.println( b);
 
		
	}
	void show()
	{
		a++;
		b++;
		System.out.println(a+  "   "+ b);
	}
	
 
}
 
 