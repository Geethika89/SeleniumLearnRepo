package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		int[] num= {12,34,56,12,56,78,36};
		
		Set<Integer> val=new TreeSet<Integer>();
		for (Integer i : num) {
			val.add(i);
		}
		System.out.println(val);
		//to get a particular value using index we use list
		List<Integer> getVal=new ArrayList<Integer>(val);
		Integer i = getVal.get(3);
		System.err.println(i);
	}

}
