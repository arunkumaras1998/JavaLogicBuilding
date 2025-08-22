package org.string;

public class FirstAndLastOccurrenceOfChar {
    public static void main(String[] args) {
        String word = "Hello, Are You There!";
        // question:  Find the first and last occurrence of character 'o'
        int firstIndex = -1; // it means provided string expected char is not found
        int lastIndex = -1;
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == 'e') {
                firstIndex = index;
                break;
            }
        }
        for (int index = word.length() - 1; index > +0; index--) {
            if (word.charAt(index) == 'e') {
                lastIndex = index;
                break;
            }
        }

        System.out.println("First Index of Character: " + firstIndex + "\n" + "Last Index of Character: " + lastIndex);
    }
}
