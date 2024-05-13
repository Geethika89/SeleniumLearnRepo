package week3.day1.homeassignment;//Incomplete

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortingUsingCollection {

	public static void main(String[] args) {
		String[] companies = {"HCL, Wipro, Aspire Systems, CTS"};
		
		List<String> listOfComp=new ArrayList<String>();
		for (String string : companies) {
			listOfComp.add(string);
		}
		System.out.println(listOfComp);
		Collections.sort(listOfComp);
		System.out.println(listOfComp);
		
	
		
		
	
	}
}