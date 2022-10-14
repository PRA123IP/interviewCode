package empinsertmap;

public class Emp {
String ename;
int eid;
public String getEname() {
	return ename;
}
public int getEid() {
	return eid;
}
@Override                                                                                                                                                            
public String toString() {
	return  eid+ " " +ename;
}
public Emp(String ename, int eid) {
	super();
	this.ename = ename;
	this.eid = eid;
}

}
