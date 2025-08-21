package org.string;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Arun Kumar A S";
        getRevStringUsingCharAt(name);
        getRevStringUsingBuffer(name);
        getRevStringUsingBuilder(name);
    }

    public static void getRevStringUsingCharAt(String name){
        String revString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            revString = revString + name.charAt(i);
        }
        System.out.println(revString);
    }

    public static void getRevStringUsingBuilder(String name){
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
    }
    public static void getRevStringUsingBuffer(String name){
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);
    }
}
