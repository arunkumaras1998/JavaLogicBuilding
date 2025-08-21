package org.swaptwonumbers;

public class UsingMathOper {
	public static void main(String[] args) {
		int a = 569;
		int b = 852;

		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
