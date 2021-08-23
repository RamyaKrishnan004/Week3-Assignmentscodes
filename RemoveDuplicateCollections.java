package week3.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCollections {
	public static void main(String[] args) {	
String string = "We learn java  basics";
System.out.println("With duplicates: " +string);
char[] chars = string.toCharArray();
StringBuilder sb = new StringBuilder();
Set<Character> charSet = new LinkedHashSet<Character>();
for (char c : chars) {
    if(charSet.add(c) ){
        sb.append(c);
    }
}
System.out.println("without duplicates: " + sb.toString()); // abcdeftz

}}