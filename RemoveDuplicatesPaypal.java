package week3.assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesPaypal {       
	 public static void main(String[] args) {
	String str = "PayPal India";
	char[] ra = str.toCharArray();
	Set<Character> charSet = new HashSet<Character>();
	Set<Character> dupcharSet = new HashSet<Character>();
	for (int i = 0; i < ra.length; i++) 
	{
	if (charSet.contains(ra[i])) {
		dupcharSet.add(ra[i]);	
	} 
	else {
		charSet.add(ra[i]);
	}
}
	charSet.remove(dupcharSet);
	System.out.println("duplicate set is : " + dupcharSet );
}
}
