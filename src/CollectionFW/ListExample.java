package CollectionFW;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(44);
		l.add("ram");
		l.add(8.90);
		l.add(null);
		l.add(true);
		
		List l1 = new ArrayList();
		l1.add(456);
		l1.add("ankush");
		l1.add("harika");
		l1.add(false);
		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(0));
		System.out.println(l.contains(8.9));
		System.out.println(l.indexOf(44));
		
		l.addAll(l1);
		System.out.println(l);
		l.removeAll(l1);
		System.out.println(l);
		
		l.remove(0);
		System.out.println(l);
		l.remove(null);
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
		
	}
}
