package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Have the function DistinctCharacters(str) take the str parameter being passed
 * and determine if it contains at least 10 distinct characters,
 * if so, then your program should return the string true,
 * otherwise it should return the string false.
 * ---
 * For example: if str is "abc123kkmmmm?" then your program should return the string false
 * because this string contains only 9 distinct characters:
 * a, b, c, 1, 2, 3, k, m. ? adds up to 9.
 */

public class DistinctCharacter {
    static String distinctCharacter(String str) {
        if(str.length() < 10) return "false";
        boolean[] hasVal = new boolean[128];
        char[] chars = str.toCharArray();
        int distinctCount = 0;
        for (char c : chars) {
            if (hasVal[c])
                continue;

            hasVal[c] = true;
            distinctCount++;
        }
        return (distinctCount >= 10) ? "true" : "false";
    }
    //Solution 2
    static String distinctChars2(String str){
        if(str.length() < 10) return "false";
        String[] chars = str.split("");
        HashSet<Character> checker = new HashSet(Arrays.asList(chars));
        return (checker.size() >= 10) ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(distinctCharacter("abc1234567kkmmmm?"));
        System.out.println(distinctCharacter("abc123kkmmmm?"));
        System.out.println(distinctChars2("abc1234567kkmmmm?"));
        System.out.println(distinctChars2("abc123kkmmmm?"));
    }
}
