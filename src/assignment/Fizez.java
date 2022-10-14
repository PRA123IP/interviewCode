package assignment;

import java.io.*;

class Result
{
	public static void test(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%15==0)
			{
				System.out.println("fizzbuzz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else
			{
				
				System.out.println(i);
			}
		}
	}
}
public class Fizez {

	public static void main(String[] args) throws Exception{
 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
 int n=Integer.parseInt(b.readLine().trim());
 Result.test(n);
 b.close();
		
	}

}
