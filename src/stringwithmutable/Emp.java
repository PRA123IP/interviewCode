package stringwithmutable;

final public class Emp {
	
final private String ename;
final private int id;
final private Address address;
Emp(String ename, int id, Address address)
{
	this.ename=ename;
	this.id=id;
	this.address=address;
}
public String getEname()
{
	return ename;
}
public int getId()
{
	return id;
}
public Address getAddress() throws CloneNotSupportedException
{
	return (Address) address.clone();
}
}
