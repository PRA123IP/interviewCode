package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5,6,6};
		//Object list;
		List stream = Arrays.stream(ar).boxed().collect(Collectors.toList());
		System.out.println(stream);
	
		
List<Integer> a=new ArrayList<Integer>();
//Collections.addAll(a,  ar);
String[] geeks = {"Rahul", "Utkarsh",
        "Shubham", "Neelam"};

List<String> al = new ArrayList<String>();

// adding elements of array to arrayList.
Collections.addAll(al, geeks);
al.add("ram");

System.out.println(al);


	}

}
