package week3.assignment;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayCollection {
public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> arrlist1=new ArrayList<Integer>();
		List<Integer> arrlist2=new ArrayList<Integer>();
		  for (int i = 0; i < arr.length; i++) {
			  for (int j = i+1; j < arr.length; j++) {
				  if(arr[i]==arr[j]) { 
					  arrlist2.add(arr[i]); 
				  } 
			  } 
			  arrlist1.add(arr[i]); 
		  }	
		
		System.out.println("List duplicates  are: "+ arrlist2);

	}}


		
		