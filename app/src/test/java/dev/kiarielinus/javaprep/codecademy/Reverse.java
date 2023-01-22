package dev.kiarielinus.javaprep.codecademy;

import java.util.Arrays;

//1. Write a Java program to reverse a string
// without using the reverse method of Java’s String class
public class Reverse {
    static String reverse(String s) {
        StringBuilder result = new StringBuilder();

        if(s.length() < 2) return s;
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    static String reverse2 (String s){
        if(s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int last = s.length() -1;
        for (int i = 0; i < s.length(); i++) {
            chars[last] = s.charAt(i);
            last--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("blue"));
        System.out.println(reverse2("blue"));

    }
}
