package CollectionFW;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PQ {
	public static void main(String[] args) {
		PriorityQueue<Integer>  pq= new PriorityQueue();
	       
//	       pq.add(5);
//	       pq.add(3);
//	 
//	       pq.add(50);
//	 
//	       pq.add(45);
//	 
//	       pq.add(52);
//	       System.out.println(pq.poll());
//	 
//	       System.out.println(pq.poll());
	 
	       
	       // heap tree
	       // min max
	       
	       
	       int a[]= {5,7,33,44,67,89,90,32,45,67,66};
	       
//	       for (int num : a) {
//	            pq.add(num);
//	        }
//	       
//	       System.out.println("Priority Queue (sorted): " + pq);
	       
	      // kth max number
	       
	       
	       int k=4;
	       //int a[]= {5,7,33,44,67,89,90,32,45,66};
	       
	       
	       for(int i=0;i<a.length;i++)
	       {
	    	   pq.offer(a[i]);
	       }
	       
	       for(int j=1;j<k;j++)
	       {
	    	   pq.poll();
	       }
	       
	       
	       System.out.println(pq.poll());
	         
	}
}
