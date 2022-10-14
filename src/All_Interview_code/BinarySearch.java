package All_Interview_code;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
public static void main(String args[])
{  ArrayList<Integer> a=new ArrayList();
a.add(10);
a.add(21);
Collections.sort(a);
int binarySearch = Collections.binarySearch(a, 2);
System.out.println(binarySearch);
}
}
