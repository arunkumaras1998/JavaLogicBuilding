package org.array;

public class SumOfArray {

	public static void main(String[] args) {
		int num[] = { 56, 32, 76, 12, 9, 2 };
		int sum = 0;

		// 1) Approach
		for (int i : num) {
			sum = sum + i;
		}
		System.out.println(sum);
		int sum2 = 0;

		// 2) Approach
		int data[] = { 56, 32, 76, 12, 10, 2 };
		for (int i = 0; i < data.length; i++) {
			sum2 = sum2 + data[i];
		}
		System.out.println(sum2);

	}

}
