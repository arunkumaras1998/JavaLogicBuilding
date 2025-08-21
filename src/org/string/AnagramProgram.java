package org.string;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listeu";

        // Converting to lowercase for better
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            // Converting String to Char Array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the both array
            Arrays.sort(charArray1); // sorting will happen in memory
            Arrays.sort(charArray2);

            // compare both sorted array

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are Anagram String");
            } else {
                System.out.println(str1 + " and " + str2 + " are NOT Anagram String");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagram String");
        }
    }


}
