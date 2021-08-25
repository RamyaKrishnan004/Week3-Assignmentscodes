package week3.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	public static void main(String[] args) {
		String[] arr = {"Wipro", "Aspire Systems", "HCL", "CTS" };
		System.out.println("Length of Array is : " + arr.length);
		Arrays.asList(arr);
		List<String> SorList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Given String is : " + SorList);
		Collections.sort(SorList);
		System.out.println("Sorted List is : " + SorList);
		Collections.reverse(SorList);
	    System.out.println("reversed list : " + SorList);
	    }}
		
		