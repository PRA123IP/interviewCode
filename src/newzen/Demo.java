package newzen;

public abstract class Demo implements First {
  Demo()
  {
	  this.B1();
  }
	@Override
	public boolean A1() {
System.out.println("A");		
return true;
	}

	@Override
	public boolean B1() {
System.out.println("B");		
return false;
	}

}
