package org.array;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] arr = { 45, 23, 12, 67, 98, 34, 76, 56, 39, 42, 678 };
		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;

		for (int i : arr) {
			if (i > largestNum) {
				secondLargestNum = largestNum;
				largestNum = i;
			} else if (i > secondLargestNum && i != largestNum) {
				secondLargestNum = i;
			}
		}

		System.out.println("Second Largest Number is: " + secondLargestNum);

	}

}
