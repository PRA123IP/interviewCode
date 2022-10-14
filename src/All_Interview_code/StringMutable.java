package All_Interview_code;
import java.util.*;
final class StringClass
{

private String st;
private int n;
StringClass(String st,int n)
{
this.st=st;
this.n=n;
}
public String getSt()
{ 
return st;
}
public int getN()
{ 
return n;
}
public static void main(String args[])
{
StringClass a=new StringClass("pradip",1001);
System.out.println(a.getSt());
System.out.println(a.getN());
}
}

