package All_Interview_code;

public class SingleTon {
	private static SingleTon a=null;
private SingleTon() {}
public static SingleTon getinstance()
{
	if(a==null)
	{
		a=new SingleTon();
		
	}
	return a;
}   
}
