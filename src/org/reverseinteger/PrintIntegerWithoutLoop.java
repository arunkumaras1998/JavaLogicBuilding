package org.reverseinteger;

public class PrintIntegerWithoutLoop {
    public static void main(String[] args) {
        int n = 10;
        printNumber(n);


    }

    public static void printNumber(int n) {
        if(n>=1) {
            printNumber(n - 1);
            System.out.println(n);
        }
    }
}
