package CollectionFW;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<>();
		
		s.add("ram");
		s.add("Harshita");
		s.add("Sakshi");
		s.add("Ismitha");
		s.add("David");
		s.add("John");
		s.add("Reese");
		s.add(null);
		
		System.out.println(s);
		
	}
}
