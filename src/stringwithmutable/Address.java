package stringwithmutable;

public class Address implements Cloneable {

	public String city;
	public String phno;
	
	Address(String city, String phno)
	{
		super();
		this.city=city;
		this.phno=phno;
		
	}
	public void SetCity(String city)
	{
		this.city=city;
		
	}
	public String getCity()
	{
		return city;
	}
	public void SetPhno(String phno)
	{
		this.phno=phno;
		
	}
	public String getPhno()
	{
		return phno;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString()
	{
		return "city---" +city+ "phno----"  +phno;
	}
	
}
