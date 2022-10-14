package All_Interview_code;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.*;
public class MapIterator {
public static void main(String[] args) {
	

	
	Map map=new HashMap();
	map.put(101,"pradip");
	map.put(106,"prdip");
	map.put(103,"dip");
	Set a=map.entrySet();
	Iterator itr=a.iterator();
	while(itr.hasNext())
	{
	Map.Entry result=(Map.Entry) itr.next();
	System.out.println(result.getKey()+" "+ result.getValue());
	}
	
	
//	int [] ar= {3,4,5,6,2};
//	String str[]= {"praduo","hhh","rdaj"}; 
//			int min=Arrays.stream(ar).boxed().max((i1,i2)->i1.compareTo(i2)).get();
//System.out.println(min);
//List s=Arrays.stream(str).sorted().collect(Collectors.toList());
//System.out.println(s);
	
}
}
