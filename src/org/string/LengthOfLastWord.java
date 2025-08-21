package org.string;

public class LengthOfLastWord {
	public static void main(String[] args) {
		int count = 0;
		String s1 = "    Welcome   To   JavaWorld     ";
		System.out.println("Before Trim: " + s1);
//		s1 = s1.trim(); // remove the white spaces from both side of the string object
		System.out.println("After Trim: " + s1);
		// output: Welcome To JavaWorld
		char[] toCharArray = s1.toCharArray(); // each values stored in index based

		System.out.println(toCharArray);

		for (int i = toCharArray.length - 1; i >= 0; i--) {
			if (toCharArray[i] != ' ') {
				count++;
			} else {
				if (count > 0) {
					

					System.out.println("Length of last word in the String is: " + count);
					break;
				}
			}
		}

	}
}

//if (count > 0) { // this logic is used for with out using built in function we got the result whatever we want
	//ex: if we have not using built method like trim() spaces are also come to the loop but not go to the inside loop
