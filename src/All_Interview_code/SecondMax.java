package All_Interview_code;

import java.util.Arrays;

public class SecondMax {
  
	public static void main(String[] args) {
		int [] a= {2,4,5,10,6};
		Integer i = Arrays.stream(a).boxed().skip(1).min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(i);
	}

}
