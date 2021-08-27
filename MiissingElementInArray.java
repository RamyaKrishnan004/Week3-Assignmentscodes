package day2;

import java.util.Arrays;

public class MiissingElementInArray {
	public static void main(String[] args) {
	int[] arr = {0,1,2,3,4,5,7};
	Arrays.sort(arr);
	for (int i =0; i< arr.length; i++) {
		if(arr[i] !=i)
		{
				System.out.println("missing element : " +  i);
				break;
			}
	}}}

