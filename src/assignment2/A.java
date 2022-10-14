package assignment2;
import java.util.stream.*;
public class A {
	public static void main(String[] args) {
		
	int ar[]={3,5,4,7,8,9,9};
	String s[]={"hi","helo"};
	//Stream.of(ar).filter(i-> i%2 ==0)
	Stream.of(ar).filter(p-> p%2 ==0).collect(Collectors.toList()).forEach(i->System.out.print(i));;
	}
}
