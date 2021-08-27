package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {
public static void main(String[] args) {
	int[] arr1 = {3,2,11,4,6,7 };
	List<Integer> arrlist = new ArrayList<Integer>();
	for (int i : arr1) {
		arrlist.add(i);
	}
	Collections.sort(arrlist);
	System.out.println(arrlist);
	int  seclarge = arrlist.get(arrlist.size()-2);
	System.out.println("Second Largest Number is : "  + seclarge);
}
}