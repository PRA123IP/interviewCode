package All_Interview_code;

public class Test {
	public static void main(String[] args) {
		 Test a=new Test();
		 int solve = a.solve(1, 2, 4);
		 System.out.println(solve);
	


	}
	public int solve(int x,int y, int z)
	{
		
		int p=x^y^z;
		return p;
		
	}
 
}
