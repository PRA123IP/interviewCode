package All_Interview_code;

import java.util.Scanner;
//amsstrong
public class Palindrom_number {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int rev=0;
  int sum=0;
     int tem=n;
     while(n!=0)
     {
      rev=n%10;
      sum+=Math.pow(rev, 3);
      n=n/10;
     }
     System.out.println(sum);
      if(sum==tem)
    	  System.out.println("amm");
      else
    	  System.out.println("no");
     }
     
		
	}


