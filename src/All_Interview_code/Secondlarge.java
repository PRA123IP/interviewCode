package All_Interview_code;

import java.util.Arrays;

public class Secondlarge {

	public static void main(String[] args) {
    int ar[]= {2,3,6,7,7,8};
    int n=ar.length;
   // Arrays.sort(ar);
    
    for(int i=0;i<n;i++)
	{
		System.out.println(ar[i]+" ");
	}

//    System.out.println(ar[ar.length-2]);
//		System.out.println(ar[ar.length-3]);
    
    int j=0;
    for(int i=0;i<n-1;i++)
    {
    	if(ar[i]!=ar[i+1])
    	{
    		ar[j++]=ar[i];
    		
    	}
   ar[j++]=ar[n-1];    
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[i]+" ");
	}

}
}