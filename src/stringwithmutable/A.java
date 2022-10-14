package stringwithmutable;

import java.io.File;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class A {
public static void main(String[] args) {
//	int ar[]= {2,1,5,9};
//	Stream<int[]> of = Stream.of(ar);
//	
//	Arrays.stream(ar).sorted().forEach(s->System.out.println(s));
//	OptionalInt max = Arrays.stream(ar).min();
//	System.out.println(max);
	File a=new File("");
	String str="madam";
	StringBuffer s=new StringBuffer(str);
	StringBuffer tem=s;
	StringBuffer reverse = s.reverse();
	System.out.println(reverse);
	if(tem.equals(reverse))
	{
		System.out.println("palindrom");
	}
	else
	{
		System.out.println("not palindrroms");
	}
}

}
