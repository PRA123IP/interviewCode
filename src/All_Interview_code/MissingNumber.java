package All_Interview_code;
//missing number 
public class MissingNumber {
public static void main(String[] args) {
	int ar[]= {1,2,3,4,6,7,8};
	int n=ar.length;
	int total=(n+2)*(n+1)/2;
	for(int i=0;i<n;i++)
	{
		total-=ar[i];
	}
	System.out.println(total);
}
}
