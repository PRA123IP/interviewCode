package empinsertmap;
import java.util.*;
public class Map1 {
public static void main(String[] args) {
	Map<Integer, Emp> re=new HashMap<>();
	
	re.put(1001, new Emp("pradip",122));
	re.put(1003, new Emp("dip",1));
	
	re.put(10034, new Emp("pp",2));
	Set a=re.entrySet();
	Iterator it=a.iterator();
	while(it.hasNext())
	{
		Map.Entry result=(Map.Entry) it.next();
		System.out.println(result);
	}
	
}
}
