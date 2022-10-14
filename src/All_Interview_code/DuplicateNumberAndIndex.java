package All_Interview_code;

public class DuplicateNumberAndIndex {
public static void main(String[] args) {
	int a[]= {1,2,2,3,5,5,6,7,7};
	int c=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				c++;
				System.out.println(a[j]+" "+i);
			}
		}
	}
	
}
}
