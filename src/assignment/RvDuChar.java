package assignment;
//remove duplicate word from the sentence

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RvDuChar {
	public static void main(String[] args) {
	String str="pradip";
	List<String> collect = Arrays.stream(str.split("")).distinct().collect(Collectors.toList());
	System.out.println(collect);
//		char []c1=str.toCharArray();
////	
//		String s="i am am bad bad student ";
//		//String []str=s.split(" ");
//		int ar[]= {3,4,5,6,6,5};
//		HashSet<String> a=new HashSet<>();
//		for (String c : str) {
//			a.add(c);
//		}
//		System.out.println(a);
	}

}
