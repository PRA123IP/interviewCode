package All_Interview_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
    int [] ar= {4,5,7,2,5,8};
 //   List a = Arrays.asList(ar);
    
    List<Integer> al=new ArrayList<>();
    for(int i: ar)
    {
    	al.add(i);
    }
    System.out.println(al); 
   // Collections.addAll(al, ar);
  //  System.out.println(a.size());

    String[] geeks = {"Rahul", "Utkarsh",
                      "Shubham", "Neelam"};

    // Conversion of array to ArrayList
    // using Arrays.asList
    List a4= Arrays.asList(geeks);
        

    System.out.println(a4);
    
	}

}
