package week3.day1.abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] num= {23,45,67,45,12,89,23};
		
		List<Integer> val=new ArrayList<Integer>();
		//for each to convert to arrayist
		for (Integer i : num) {
			val.add(i);
		}
		System.out.println(val);
		Collections.sort(val);
		System.out.println("sorted list:" +val);
		
		//iterating
		for(int i=0;i<val.size()-1;i++) {
			if(val.get(i)==val.get(i+1)) {
				System.out.println(val.get(i));
			}
		}
	}

}
