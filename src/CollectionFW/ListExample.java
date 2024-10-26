package CollectionFW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {
		
//		List l = new ArrayList();
//		l.add(44);
//		l.add("ram");
//		l.add(8.90);
//		l.add(null);
//		l.add(true);
//		
//		List l1 = new ArrayList();
//		l1.add(456);
//		l1.add("ankush");
//		l1.add("harika");
//		l1.add(false);
//		
//		
//		System.out.println(l);
//		System.out.println(l.size());
//		System.out.println(l.get(0));
//		System.out.println(l.contains(8.9));
//		System.out.println(l.indexOf(44));
//		
//		l.addAll(l1);
//		System.out.println(l);
//		l.removeAll(l1);
//		System.out.println(l);
//		
//		l.remove(0);
//		System.out.println(l);
//		l.remove(null);
//		System.out.println(l);
//		
//		l.clear();
//		System.out.println(l);
		
		
		
//		int Marks[]={22,55,66,77,89,2,3,4,77,89};
//		List <Integer>pass = new ArrayList();
//		 
//		List <Integer>fail = new ArrayList();
//		 
//		for(int i=0;i<Marks.length;i++)
//		{
//		if(Marks[i]>=40)
//		{
//		  pass.add(Marks[i]);
//		}
//		else
//		{
//		fail.add(Marks[i]);
//		}
//		}
//		System.out.println(pass);
//		System.out.println(fail);
		
		String books[]={"react","js","dsa","c++","react","java","js","node js","mongodb"};
//		 List <String>al= new ArrayList();
		
//		   for( int i =0;i<books.length;i++)
//		   {
//			   if(al.contains(books[i]))
//			   {
//				   System.out.println(books[i]);
//				   
//			   }
//			   else
//			   {
//				   al.add(books[i]);
//			   }
//		   }
		 
		Set<String> set = new HashSet();
		
		for(String i : books) {
			set.add(i);
		}
		
		 System.out.println(set);
		 
		 
		 // Map is a key value pair
		 //it is an interface
		 //if u write a duplicate key it will not show an error instead it will overwrite the value of that key.
		 
		 Map<String, String> users = new HashMap();
		 users.put("101", "asha");
		 users.put("102", "pooja");
		 users.put("103", "deepa");
		 users.put("104", "Kavita");
		 users.put("105", "ajay");
		 
		 if(users.containsKey("101")) {
			 System.out.println(users.get("101"));
		 }
		 else {
			 System.out.println("Not found");
		 }
		 
	}
}
