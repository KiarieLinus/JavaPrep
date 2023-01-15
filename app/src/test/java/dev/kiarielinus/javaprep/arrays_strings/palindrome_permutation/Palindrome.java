package dev.kiarielinus.javaprep.arrays_strings.palindrome_permutation;

import java.util.Arrays;
import java.util.Locale;


//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
//        is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
//        EXAMPLE
//        Input: Tact Coa
//        Output: True (permutations: "taco cat", "atco eta", etc.)
public class Palindrome {
    static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chars);
        int size = 0;

        for (char c : chars) {
            if ((int) c >= (int) 'a' && (int) c <= (int) 'z') {
                size++;
            }
        }

        if (s.trim().length() <= 1) return false;
        for (int i = 0; i <= s.length() - 2; i++) {
            int val = chars[i];
            if (val >= (int) 'a' && val <= (int) 'z') {
                if (chars[i] == chars[i + 1]) {
                    size -= 2;
                    i++;
                }
            }
        }
//        System.out.println(size);
        return size == 0 || size == 1;
    }


    static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    /* Check that no more than one character has an odd count. */
    static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    /* Map each character to a number. a -> 0, b -> 1, c -> 2, etc.
     * This is case insensitive. Non-letter characters map to -1. */
    static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    /* Count how many times each character appears. */
    static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }



    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("aaab"));
        System.out.println(isPalindrome("aaab"));

        System.out.println(isPermutationOfPalindrome("aaab123b"));
        System.out.println(isPalindrome("aaa123bb"));

        System.out.println(isPermutationOfPalindrome("aa abab"));
        System.out.println(isPalindrome("aa abab"));
    }
}
