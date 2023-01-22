package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function ExOh(str) take the str parameter being passed
 * and return the string true if there is an equal number of x's and o's,
 * otherwise return the string false. Only these two letters
 * will be entered in the string, no punctuation or numbers.
 * For example: if str is "xooxxxxooxo" then the output
 * should return false because there are 6 x's and 5 o's.
 */

public class ExOh {
    static String exOh(String str){
        int eXVal =0;
        int ohVal =0;
        char[] chars = str.toLowerCase().toCharArray();

        for(char i : chars){
            if(i == 'x'){
                eXVal++;
                continue;
            }
            ohVal++;
        }
        return (ohVal == eXVal)? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(exOh("xooxoxxxooxo"));//true
        System.out.println(exOh("xooxxxxooxo"));//false
    }
}
