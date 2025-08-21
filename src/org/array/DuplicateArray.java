package org.array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 5, 5, 6, 6, 7, 8, 8, 3, 3, 3};
        Map<Integer, Integer> duplicate = new HashMap<>();
        for (int num : arr) {
            duplicate.put(num, duplicate.getOrDefault(num, 0) + 1);
        }

        System.out.println(duplicate);
        for (Integer value : duplicate.keySet()) {
            System.out.println("Number: "+value + "\t" + "Occurrence: "+duplicate.get(value));
        }
    }
}
