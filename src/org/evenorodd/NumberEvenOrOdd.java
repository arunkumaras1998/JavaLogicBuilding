package org.evenorodd;

public class NumberEvenOrOdd {
	public static void main(String[] args) {
		int num = 77;
		// Logic
//		Any Number is divisible with 2 and get reminder as 0 - we called it as Even Number
//		Any Number is divisible with 2 and get reminder as 1 - we called it as Odd Number

		if (num % 2 == 0) {
			System.out.println(num + " its is an Even Number");
		} else {
			System.out.println(num + " it is an Odd Number");
		}
	}

}
