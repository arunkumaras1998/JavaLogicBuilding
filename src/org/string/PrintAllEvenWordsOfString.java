package org.string;

public class PrintAllEvenWordsOfString {
	public static void main(String[] args) {
		String quote = "Sky is Blue and Vast";

//		Step1: split string obj and store each word in an array

		String[] data = quote.split(" ");

		for (String word : data) {
//			int size = word.length();
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}
	}

}
