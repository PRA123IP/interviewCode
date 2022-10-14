package All_Interview_code;

public class Max {

	static int findlargest(int []n)
	{
		int max=n[0];
		for(int i=1; i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
			return max;
		}
		return 0;
	}
	static public   void main(String[] args) {
int []n= {2,330,-6,5,77};
int result=Max.findlargest(n);
System.out.println(result);
	
	}
}
