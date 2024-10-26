package CollectionFW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		Scanner   sc = new Scanner(System.in);
        int a[]= {11,33,44,11,33,55,77,88,55,44,55,44};
        
         
        Map<Integer,Integer> map= new HashMap();
        for(int i=0;i<a.length;i++)
        {
       	 if(map.containsKey(a[i]))
       	 {
       		
       		 int c=map.get(a[i]);
       		 map.put(a[i], c+1);
       	 }
       	 else
       	 {
       		 map.put(a[i], 1);
       	 }
        }
        
        System.out.println(map);
        
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == 1) {
                System.out.println("First non repeating number is: " + a[i]);
                break;
            }
        }
	}
}
