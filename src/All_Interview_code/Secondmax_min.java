package All_Interview_code;

import java.util.Arrays;
import java.util.List;

public class Secondmax_min {
public static void main(String[] args) {
	List<Integer> a =Arrays.asList(2,4,6,2,7,8,9);
	Integer first = a.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(first);
	Integer second=a.stream().filter(i1->i1!=first).max((i1,i2)->i1.compareTo(i2)).get();
System.out.println(second);
System.out.println("-----------------");
Integer firstmin = a.stream().min((i1,i2)->i1.compareTo(i2)).get();
System.out.println(firstmin);
Integer secondmin=a.stream().filter(i1->i1!=first).min((i1,i2)->i1.compareTo(i2)).get();
System.out.println(secondmin);
}
}
