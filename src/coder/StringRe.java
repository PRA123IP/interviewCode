package coder;

import java.util.Scanner;

public class StringRe {
public static String Stringreplace(String str)
	{
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		return str;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(Stringreplace(sc.nextLine()));
	}

}
