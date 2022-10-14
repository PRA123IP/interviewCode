package All_Interview_code;

public class Sort {
public static void main(String[] args) {
int ar[]= {7,6,6,8,9,2};
for(int i=0;i<ar.length;i++)
{   int temp;
	for(int j=i+1;j<ar.length;j++)
	{
		if(ar[i]<ar[j])
		{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
	}
	System.out.println(ar[i]);
}
}
}
