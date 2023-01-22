package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Have the function NonrepeatingCharacter(str)
 * take the str parameter being passed,
 * which will contain only alphabetic characters and spaces,
 * and return the first non-repeating character.
 * ---
 * For example: if str is "agettkgaeee" then your program should return k.
 * The string will always contain at least one character and there will
 * always be at least one non-repeating character.
 */

public class NonRepeatingChar {
    static String nonRepeatingChar(String str) {
        str = str.trim().replace(" ", "");
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> mapper = new HashMap<>();
        for (char c : chars) {
            if (mapper.containsKey(c)) {
                mapper.put(c, mapper.get(c) + 1);
                continue;
            }
            mapper.put(c,1);
        }
        int index = Integer.MAX_VALUE;
        int temp = 0;

        for(char c : mapper.keySet()){
            if(mapper.get(c) == 1){
                temp = str.indexOf(c);
                if(temp < index) index = temp;
            }
        }
        return String.valueOf(str.charAt(index));
    }

    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("agettk gaeee bloo tall"));
    }
}
