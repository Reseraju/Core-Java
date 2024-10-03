package CollectionFW;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		for(int i =0; i< 10; i++) {
			a1.add(i);
		}
		
//		System.out.println(a1);
//		
//		for(int i =0; i<a1.size(); i++) {
//			System.out.println(a1.get(i));
//		}
		
		for(Object i: a1) {
			
			//type casting from Object to Integer(parent to child)-> downcasting
			Integer x = (Integer)i;
			
			if(x % 2 == 0) {
				System.out.println(x);
			}
			
		}
		
		
	}
}
