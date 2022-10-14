package All_Interview_code;
import java.util.*;
import java.util.stream.*;
public class DuplicatewordRv {

	public static void main(String[] args) {
		String str="pradip pradip giri";
//		char []c=str.toCharArray();
//		Set<Character> a=new LinkedHashSet<>();
//		for(Character i:c)
//		{
//			a.add(i);
//		}
//		
//		for (Character ch : a) {
//			System.out.print(ch);
//		}
//		
		List<String> collect2 = Arrays.stream(str.split(" ")).distinct().collect(Collectors.toList());
		System.out.println(collect2);
//		List<Character> collect = a.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);
	}

}
