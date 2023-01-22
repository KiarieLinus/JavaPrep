package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function LargestPair(num) take the num parameter being passed
 * and determine the largest double-digit number within the whole number.
 * ---
 * For example: if num is 4759472 then your program should return 94 because
 * that is the largest double-digit number.
 * The input will always contain at least two positive digits.
 */

public class LargestPair {

    static int largestPair(long num){
        String[] str = String.valueOf(num).split("");
        int result = 0;
        for (int i = 0; i < str.length-1; i++) {
            int temp = Integer.parseInt(str[i]+str[i+1]);
            if(temp > result) result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(largestPair(4759472));
        System.out.println(largestPair(2567353664L));
    }
}
