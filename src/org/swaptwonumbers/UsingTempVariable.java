package org.swaptwonumbers;

public class UsingTempVariable {
	public static void main(String[] args) {
		int a = 58;
		int b = 98;
		int temp;

		System.out.println("a= " + a);
		System.out.println("b= " + b);

		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
