package All_Interview_code;

public class Seynchronize {
	
int bal=40;
public static void main(String[] args) {
	
	Seynchronize s=new Seynchronize();
	s.account();
	System.out.println(s.bal);
	
}

public void account()
{
	Thread t=new Thread(new Runnable ()
			{
		public void run()
		{
			add();
		}
		
		});
	
	Thread t1=new Thread(new Runnable() {
		public void run()
		{
			sub();
		}
	}) ;
	
	
	
	t.start();
	t1.start();
	try {
		t.join();
		t1.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}

public void sub()
{
	for(int i=0;i<1000;i++)
	{
		bal=bal-i;
	}
}

public  void add()
{
	for(int i=0;i<1000;i++)
	{
		bal+=i;
	}
		
}



}
