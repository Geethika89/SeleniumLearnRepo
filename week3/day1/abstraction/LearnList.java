package week3.day1.abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		List<String> mentors= new ArrayList<String>();
		mentors.add("aaa");
		mentors.add("ddd");
		mentors.add("ggg");
		mentors.add("hhh");
		
		System.out.println("List of mentors :" +mentors);
		
		// to remove any one
		mentors.remove(1);
		System.out.println("The list of mentors : "+mentors);
		
		//to add a new name
		mentors.add("rrr");
		System.out.println("The list of mentors are : "+mentors);
		
		//to add in 1st position add with index
		mentors.add(1, "rrr");
		System.out.println("The mentors list add with index : "+mentors);
		
		//to print with index value
		String string = mentors.get(2);
		System.out.println("The mentor with index : "+string);
		
		//contains
		boolean contains = mentors.contains("rrr");
		System.out.println(contains);
		
		//to sort in order
		Collections.sort(mentors);
		System.out.println("sorted list:" +mentors);
		
		//for loop
		for (int i=0;i<mentors.size();i++) {
			String string2 = mentors.get(i);
		System.out.println(string2);
			
		}
		//collection concept uses advance for loop
		//will not work due to conflict in data types
	/*	for(String i:mentors) {
			mentors.get(i)
		}*/
		
		mentors.clear();
		System.out.println("Cleared list : "+mentors);
	}

}

