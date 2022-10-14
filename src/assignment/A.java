package assignment;

public class A {
public static void main(String args[])
{
	int x[][]= {{2,4,5},{3,1,9},{3,4,5}};
	int y[][]= {{2,4,5},{3,1,9},{3,4,5}};
	int z[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			z[i][j]=x[i][j]+y[i][j];
			System.out.println(z[i][j]+" ");
		}
		System.out.println();
	}
	
	

}
	
}
