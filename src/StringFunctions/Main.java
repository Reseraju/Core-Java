package StringFunctions;

import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) {
		
		
//		String str="welcome in java oops ";
//		StringTokenizer token=new StringTokenizer(str);
//		
//		System.out.println(	token.countTokens());  // 4
//		
//		while(token.hasMoreElements())
//		{
//			
//			System.out.println(	token.nextToken());
//	 
//		}	
		
		
		
//		String str1 = "they@apple@daily@aman@orange";
//		StringTokenizer token1 = new StringTokenizer(str1, "@");
//		
//		int count = 0;
//		while(token1.hasMoreTokens()) {
//			String word = token1.nextToken();
//			char fl = word.charAt(0);
//			if(fl == 'a' || fl =='e' || fl == 'i' || fl == 'o' || fl == 'u') {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		System.out.println(y);
		
	}
 
}
