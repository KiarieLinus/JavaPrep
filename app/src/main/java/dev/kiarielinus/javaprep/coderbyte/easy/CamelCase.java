package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Arrays;

/**
 * Have the function CamelCase(str) take the str parameter being passed
 * and return it in proper camel case format where the first letter
 * of each word is capitalized (excluding the first letter).
 * ---
 * The string will only contain letters and some combination of delimiter
 * punctuation characters separating each word.
 * For example: if str is "BOB loves-coding" then your program
 * should return the string bobLovesCoding.
 */

public class CamelCase {
    static String camelCase(String str) {
        String[] words = str
                .toLowerCase()
                .replaceAll("[^a-z]", " ")
                .trim()
                .split("[\\s]+");
        for (int i = 0;i<words.length;i++) {
            if(i != 0){
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
        }
        return String.join("",words);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("###@BOB,.+=loves-coding!!!"));
    }
}
