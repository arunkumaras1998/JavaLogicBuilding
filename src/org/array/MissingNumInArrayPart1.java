package org.array;

public class MissingNumInArrayPart1 {

	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		// fin the sum of consecutive numbers of range from 1 to 8 = 8
		int totalNum = 11;
		int actualSum = totalNum * (totalNum + 1) / 2;
		System.out.println(actualSum);
		int expectedSum = 0;
		for (int i = 0; i < data.length; i++) {
			expectedSum = expectedSum + data[i];
		}
		System.out.println(expectedSum);

		int missingNum = actualSum - expectedSum;
		System.out.println("Missing Number is " + missingNum);
	}

}
