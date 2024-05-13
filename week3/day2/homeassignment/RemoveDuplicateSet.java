package week3.day2.homeassignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		
		String str="PayPal India";
		char[] charArray = str.toCharArray();
		
	Set<Character> charSet =new LinkedHashSet<Character>();
	Set<Character> dupCharSet  =new LinkedHashSet<Character>();
	//Boolean repeated=false;
		for(int i=0;i<charArray.length;i++) {
			charSet.add(charArray[i]);
		
			/*for(int j=i+1;j<charArray.length;j++) {
				
				if(charArray[i]==charArray[j]) {
					repeated=true;	
					dupCharSet.add(charArray[i]);
					}				
			}
			
			if(repeated==false) {
				charSet.add(charArray[i]);
			}
		
		}*/

		}
		
		System.out.println(charSet);
	
		System.out.println(charSet);
		}
}
