package dev.kiarielinus.javaprep.arrays_strings.check_permutation;

import java.util.Arrays;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other
public class CheckPermutation {

    static String sort(String content){
        char[] chars = content.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    static boolean isPermutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main(String[ ] args) {
        boolean result = isPermutation("god  ", "dog");
        System.out.println(result);
    }
}
