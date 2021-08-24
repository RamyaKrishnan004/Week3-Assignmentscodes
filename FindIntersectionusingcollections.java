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
		


