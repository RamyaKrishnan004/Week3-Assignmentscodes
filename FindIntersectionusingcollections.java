package week3.assignment;



import java.util.HashSet;
import java.util.Set;

public class FindIntersectionusingcollections {
	public static void main(String[] args) {	
	Set<Integer> arr1 = new HashSet<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		Set<Integer> arr2 = new HashSet<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		arr2.add(7);
		arr1.retainAll(arr2);
		System.out.println("Intersection Arrays are: " + arr1);
		
		
		
	}}
		


/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */