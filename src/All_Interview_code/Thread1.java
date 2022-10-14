package All_Interview_code;

public class Thread1 extends Thread 
{
	String str;
	Thread1(String str)
	{
		this.str=str;
	}
	public void run()
	{
		
	
for(int i=0;i<1000;i++)
		
	{
		System.out.println(this.str);
	}
	}

	
	public static void main(String[] args) {
		Thread1 a =new Thread1("p");
		Thread1 a1 =new Thread1("88");
		Thread1 a2 =new Thread1("rr")
				;;
		a.start();
		a1.start();
		a2.start();
		
	}
	
	
}

