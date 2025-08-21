package org.reverseinteger;

public class ReverseIntegerNumber {
	public static void main(String[] args) {
		int number = 7896567; // given number - output - 654
		// Logic
		// if we have do number%10; result: quotient then we will get last digit on
		// number
		// if we have do number/10; result: it will return all digits except last num

		int reverseNum = 0;
		int lastDigit= 0;

		while (number != 0) {
			lastDigit = number % 10; // 6
			reverseNum = reverseNum * 10 + lastDigit; // It works based on BODMAS rule
			number = number / 10;
		}
		System.out.println("Reverse Num of is: " + reverseNum);

	}
}







//		if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
//			System.out.println(0);
//			System.exit(0); // overflow
//		}
//
//		if (reverseNum > Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && lastDigit > 7)) {
//			System.out.println(0);
//			System.exit(0); // overflow
//		}

// Below is bad practice
//		lastDigit = number % 10; // 6
//		reverseNum = reverseNum * 10 + lastDigit; // It works based on BODMAS rule
//		number = number / 10;
//
//		lastDigit = number % 10; // 5
//		reverseNum = reverseNum * 10 + lastDigit; // It works based on BODMAS rule
//		number = number / 10;
//
//		lastDigit = number % 10; // 4
//		reverseNum = reverseNum * 10 + lastDigit; // It works based on BODMAS rule
//		number = number / 10;