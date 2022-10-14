package All_Interview_code;
@FunctionalInterface
interface A111
{
	public void test();
}
public interface Funtional_Interf extends A111 {
public void test();
public static void main(String[] args) {
	Funtional_Interf a=()->{
		System.out.println("tetrd ");
	};
	a.test();
}
}
