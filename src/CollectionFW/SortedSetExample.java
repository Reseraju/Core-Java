package CollectionFW;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<Student> s = new TreeSet<>(new StudentIdComparator());
		
		Student reese = new Student(100, "Reese");
		Student beeji = new Student(200, "Harshita");
		Student sakshi = new Student(300, "Sakshi");
		
		s.add(reese);
		s.add(beeji);
		s.add(sakshi);
		
		System.out.println(s);

	}

}
