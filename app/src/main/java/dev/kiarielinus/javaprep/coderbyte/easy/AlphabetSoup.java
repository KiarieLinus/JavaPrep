package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Arrays;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed
 * and return the string with the letters in alphabetical order (i.e. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */
public class AlphabetSoup {

    static String alphabetSoup(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(alphabetSoup("hello"));
    }
}
