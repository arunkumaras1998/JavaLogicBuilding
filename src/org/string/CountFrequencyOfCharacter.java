package org.string;

import java.util.HashMap;

public class CountFrequencyOfCharacter {
	public static void main(String[] args) {
		String input = "madam";
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		char[] inputArray = input.toCharArray();

		for (char c : inputArray) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		for (char c : frequencyMap.keySet()) {
			System.out.println(c + "\t" + frequencyMap.get(c));
		}
	}
}
