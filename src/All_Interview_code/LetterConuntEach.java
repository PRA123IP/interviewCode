package All_Interview_code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterConuntEach {
	public static void main(String[] args) {
		
	
	String s= "CCommunication";
	Map<String, Long> result=Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s3 -> s3,LinkedHashMap::new,Collectors.counting()));
	System.out.println(result);
	}

}
