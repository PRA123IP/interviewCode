package assignment2;
import java.util.*;
public class E implements Cloneable {
public static void main(String[] args){
E e1 = new E();
try {
E e2 = (E) e1.clone();
System.out.println(e1);
System.out.println(e2);
} catch (CloneNotSupportedException
e) {
e.printStackTrace();
}
}}