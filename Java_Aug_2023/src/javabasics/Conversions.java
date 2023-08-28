package javabasics;

public class Conversions {
	
	public static void main(String[] args) {
		
		long x = 10;
		Long y = Long.valueOf(x);
		System.out.println("long to Long:"+y);
		String s = y.toString();
		System.out.println("Long to String:"+s);
		Long z = Long.valueOf(s);
		System.out.println("String to Long:"+z);
		int a =100;
		String y1 = Integer.toString(a);
		System.out.println("int to String:"+y1);
		Integer b1=Integer.valueOf(y1);
		System.out.println("String to Integer:"+b1);
		Integer b3=Integer.valueOf(8);
		String d4=b3.toString();
		System.out.println("Integer to String:"+d4);
		
	}

}
