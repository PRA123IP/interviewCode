package All_Interview_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class A  {

public static void main(String[] args) {
	
	String str= "i am pradip giri pradip";
	
	Set<Integer> a=new HashSet<>();
	List<Integer> asList = Arrays.asList(12,34,3,3,4,4,5,12,34);
	asList.stream().filter(i->!a.add(i)).forEach(x->System.out.println(x));
//	List<String> list = Arrays.asList(str.split(" "));
//	List<String> collect = list.stream().distinct().collect(Collectors.toList());
//	System.out.println(collect);
	//Map<String, Long> result=Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
   // System.out.println(result);
}
}
