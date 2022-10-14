package All_Interview_code;

public class ThreadEx{
	
int bal;
	public static void main(String[] args) {
		ThreadEx a=new ThreadEx();
		a.account();
		System.out.println(a.bal);
	}
	public void account()
	{
		Thread t1=new Thread(new Runnable (){
			public void run()
			{
				add();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				sub();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public   void add()
	{
		for (int i=10;i<1000;i++)
		{
			bal+=i;
		}
	}

	public void sub()
	{
		for (int i=10;i<1000;i++)
		{
			bal-=i;
		}
	}
	
}
