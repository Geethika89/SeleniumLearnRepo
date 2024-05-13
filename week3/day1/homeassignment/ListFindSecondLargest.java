package week3.day1.homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFindSecondLargest {

	public static void main(String[] args) {
		int[] arr= {3, 2, 11, 4, 6, 7};
		List<Integer> arryList	= new ArrayList<Integer>();
		 for (Integer i : arr) {
			arryList.add(i);
		}
		 System.out.println(arryList);
		 Collections.sort(arryList);
		 System.out.println(arryList);
		/* To Reverse the array or to display in descending order
		 *  Collections.reverse(arryList);
		 
		 System.out.println(arryList); */
		 
		System.out.println(arryList.size());
		
		Integer i = arryList.get(arryList.size()-2);
		System.out.println(i);

	}

}
