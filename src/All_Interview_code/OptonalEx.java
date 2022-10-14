package All_Interview_code;

import java.util.Optional;

public class OptonalEx {
int x=90;
public static void main(String[] args) {
	OptonalEx a=null;
	Optional<OptonalEx> b = Optional.ofNullable(a);
	System.out.println(b.isPresent());
	if(b.isPresent()==true)
	{
		System.out.println("not null= "+a.x);
	}
	else
	{
		System.out.println(a.x);
	}
}
}
