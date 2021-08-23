package week3.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCollections {
	public static void main(String[] args) {	
String string = "We learn java  basics";
System.out.println("With duplicates: " +string);
char[] ra = string.toCharArray();
StringBuilder strb = new StringBuilder();
Set<Character> charSet = new LinkedHashSet<Character>();
for (char c : ra) {
    if(charSet.add(c) ){
        strb.append(c);
    }
}
System.out.println("without duplicates: " + strb.toString()); 

}}