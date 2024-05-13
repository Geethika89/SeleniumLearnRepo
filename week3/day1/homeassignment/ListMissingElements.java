package week3.day1.homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingElements {

	public static void main(String[] args) {
		int[] arr=  {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> arrList =new ArrayList<Integer>();
		for (Integer i : arr) {
			arrList.add(i);
		}
		System.out.println(arrList);
		Collections.sort(arrList);
		System.out.println(arrList);
		for(int i=0;i<arrList.size()-1;i++) {
			if((arrList.get(i+1))!=(arrList.get(i)+1)) {//get(5)!=get(4)+1=
				System.out.println(arrList.get(i)+1);
			}
		}
	}

}
