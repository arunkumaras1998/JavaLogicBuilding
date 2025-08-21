package org.array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 5, 5, 6, 6, 7, 8, 8, 3, 3, 3};
        Map<Integer, Integer> duplicate = new HashMap<>();
        for (int num : arr) {
            if (duplicate.containsKey(num)) {
                duplicate.put(num, duplicate.get(num) + 1);
            } else {
                duplicate.put(num, 1);
            }

        }

        System.out.println(duplicate);
        for (Map.Entry<Integer, Integer> value : duplicate.entrySet()) {
            System.out.println("Number: " + value.getKey() + "\t" + "Occurrence: " + value.getValue());
        }
    }
}
