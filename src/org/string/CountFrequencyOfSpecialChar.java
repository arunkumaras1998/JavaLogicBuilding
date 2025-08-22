package org.string;

import java.util.HashMap;

public class CountFrequencyOfSpecialChar {
    public static void main(String[] args) {
        String myPassword = "dfg$%* bHdgu ^#&@JGFJG%#^*@*$fbjfg%$#%";
        // we have to exclude Alphabets, Numbers and space
        HashMap<Character, Integer> specialChar = new HashMap<>();
        char[] toCharPassword = myPassword.toCharArray();
        for (char c : toCharPassword) {
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == ' '))) {
                if (specialChar.containsKey(c)) {
                    specialChar.put(c, specialChar.get(c) + 1);
                } else {
                    specialChar.put(c, 1);
                }
            }
        }
        for (char c : specialChar.keySet()) {
            System.out.println("Special Character: " + c + "\t" + " Occurrence: " + specialChar.get(c));
        }
    }
}
