package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Test1 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Reese");
		al.add("Beeji");
		al.add("Sakshi");
		al.add("Jude");
		al.add("John");
		
		System.out.println("\n------Using sort() methd of Collection class------\n");
		
		Collections.sort(al, (x,y)-> y.compareTo(x));
		System.out.println(al);
		
		
//		Stream<String> sorted = data.sorted();		
//		al.stream().sorted().forEach(n -> System.out.println(n));
		
		System.out.println("\n------Using stream pipeline------\n");
		// Capitalize 
		al.stream().map(x -> x.toUpperCase()).forEach(x->System.out.println(x));  //op will be sorted bcz we first run Collection.sort()
		
		//Sorting
//		al.stream().sorted().forEach(x -> System.out.println(x));
	}
}
