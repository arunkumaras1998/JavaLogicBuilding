package org.swaptwonumbers;

public class UsingExOrOper {
	public static void main(String[] args) {
		int a = 30; // binary number of 30 : 11110
		int b = 15; // binary number of 15 : 01111

		System.out.println("a= " + a);
		System.out.println("b= " + b);

//		Step1: First we have to find the binary format of both number

//		int a = 30; // binary number of 30 : 11110
//		int b = 15; // binary number of 15 : 01111

		a = a ^ b; // comparing 11110 with 01111 = 10001 = 17

		b = a ^ b; // comparing 10001 with 01111 = 11110 = 30

		a = a ^ b; // Comparing 10001 with 11110 = 01111 = 15
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}
}
