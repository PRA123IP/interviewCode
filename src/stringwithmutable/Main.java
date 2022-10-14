package stringwithmutable;

public class Main {
public static void main(String[] args) throws Exception {
	Emp a=new Emp("pradip",1001, new Address("egra","9676755"));
	Address address = a.getAddress();
	System.out.println(address);
	address.SetCity("kolkata");
	address.SetPhno("767767866");
	System.out.println(a.getAddress());
}
}
