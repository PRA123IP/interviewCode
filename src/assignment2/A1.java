package assignment2;
class Tree{}
class Pine extends Tree{}
class Oak extends Tree{}

public class A1 {

public static void main(String[] args) {
Tree t=new Pine();
if(t instanceof Pine)
{
	System.out.println("pine");
}
else if(t instanceof Tree)
{
	System.out.println("tree");
}
else if(t instanceof Oak)
{
	System.out.println("okk");
}
else
{
	System.out.println("oopp");
}
//System.out.println(a.i);

}
}
