package p1;

import java.util.*;

public class A1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	 int c=0;
	 if(n==0||n==1)
	 {
		 System.out.println("not prime");
	
	 }
	 else
		 {
		 
		 for(int i=2;i<n/2;i++)
		 
	{
	if(n%i==0)
	c++;
	}
	if(c==0)
	{
	System.out.println("prime");
	}
	else
	System.out.println("not prime");
	}
}
	}