package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function FirstReverse(str) take the str parameter
 * being passed and return the string in reversed order.
 * For example: if the input string is "Hello World and Coders"
 * then your program should return the string sredoC dna dlroW olleH.
 */

public class FirstReverse {
    static String firstReverse(String str){
        if(str.length() == 1) return str;
        StringBuilder sb = new StringBuilder(str);
        return new String(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println(firstReverse("Hello World and Coders"));
    }
}
