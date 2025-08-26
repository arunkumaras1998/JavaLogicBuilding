package org.array;

public class MoveAllZerosToEndInArray {

    public static void main(String[] args) {
        int[] num = {1, 0, 4, 0, 2, 0, 3,5,9,2,0,0,6,0,1};
        int putNonZeroValue = 0; // position to place the next non zero values
        int temp;

        for (int current = 0; current < num.length; current++) {
            if (num[current] != 0) {
                temp = num[putNonZeroValue];
                num[putNonZeroValue] = num[current];
                num[current] = temp;
                putNonZeroValue++;
            }
        }

        for (int print : num) {
            System.out.print(print + " ");
        }

        System.out.println();

        moveZeros(num);


    }

    // Second Approach

    public static void moveZeros(int[] num) {
        /*
        We initialize an index variable to 0.
        This index keeps track of the position in the array where the next non-zero number should be placed.
        * */
        int index = 0;
        /*
        This loop goes through every element of the array.
        If the current element arr[i] is not zero, it means it's a number we want to keep at the front.
        We copy this non-zero value to arr[index] and then increment index.
        This effectively pushes all non-zero elements to the front in the same order they appeared in.
         */
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[index++] = num[i];
            }
        }

        /*
        At the end of this loop:
        All non-zero numbers are grouped at the beginning of the array.
        index now points to the first position where a zero should be inserted.

        This loop starts from where we stopped placing non-zero numbers.
        It fills the rest of the array with zeros.
        So all zeros are "moved" to the end
       */
        while (index < num.length) {
            num[index++] = 0;
        }

        for (int value : num) {
            System.out.print(value + " ");
        }
    }

}
