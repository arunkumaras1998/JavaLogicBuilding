package org.string;

public class LenthOfStringANDCheckEvenorOdd {
	public static void main(String[] args) {
		String name = "Arun";
		int value = name.length();
		System.out.println(value);
		if (value % 2 == 0) {
			System.out.println(name + " it is even length string");
		} else {
			System.out.println(name + " it is odd length string");
		}
	}
}
