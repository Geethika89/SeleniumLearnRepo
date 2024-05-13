package week3.day2.homeassignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqCharSet {

	public static void main(String[] args) {
		String name="Geethika";
		char[] chArr = name.toCharArray();
		
		Set<Character> uniq=new HashSet<Character>();
		for (Character c : chArr) {
			uniq.add(c);
		}
		System.out.println(uniq);
		
	}

}
