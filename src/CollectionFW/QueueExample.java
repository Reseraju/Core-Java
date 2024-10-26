package CollectionFW;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println("original queue: " + queue);
		
		int firstElement = queue.remove();
		queue.add(firstElement);
		
		System.out.println("Final queue:" + queue);
	}
}
