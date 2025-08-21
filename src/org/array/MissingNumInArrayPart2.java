package org.array;

public class MissingNumInArrayPart2 {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 11 };
		int missingNum = 0;
		for (int no : numbers) {
			missingNum = missingNum ^ no;
		}

		for (int i = 1; i <= 11; i++) {
			missingNum = missingNum ^ i;
		}

		System.out.println(missingNum);
	}

}
