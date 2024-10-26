package CollectionFW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String,String> users = new HashMap();
		users.put("reese", "reese123");
		users.put("jude", "jude123");
		
		System.out.println("Enter username: ");
		String username = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();
		
		users.put(username, password);
		
//		if(users.containsKey(username))
//        {
//     	   System.out.println(users.get(username));
//        }
//        else
//        {
//     	   System.out.println("Not Found ");
//        }
		
		

    
	      if(users.containsKey(username))
	      {
	    	    if(users.get(username).equals(password))
	    	    {
			    	  System.out.println("Welcome ");

	    	    	
	    	    }
	    	    else
	    	    {
			    	  System.out.println("Users password  does not match");

	    	    }
	    	  
	      }
	      else
	      {
	    	  System.out.println("Users id does not exist");
	      }
	}
}
