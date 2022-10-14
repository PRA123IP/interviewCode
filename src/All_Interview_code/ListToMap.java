package All_Interview_code;

import java.util.*;
import java.util.stream.Collectors;
class Emp
{
	int eid;
	String ename;
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public String toString()
	{
		return eid+ " ," +ename;
	}
	
	
}
public class ListToMap {
public static void main(String[] args) {
	List<Emp> a=new ArrayList<>();
	a.add(new Emp(101,"pradip"));
	a.add(new Emp(102,"dip"));
	a.add(new Emp(103,"dipu"));
	a.add(new Emp(104,"debjit"));
	Set<Emp> s=new HashSet<>(a);
	
	s.forEach(item->System.out.println(item));
	Map<Integer, Emp> map=new HashMap<>();
Map<Integer, Emp> collect = a.stream().collect(Collectors.toMap(i->i.getEid(), item->item));
collect.forEach((k,v)->System.out.println(k+ " = "+v));
}
}
