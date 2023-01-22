package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Arrays;

/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
 * and return the string true if any combination of numbers in the array
 * (excluding the largest number) can be added up to equal the largest number in the array,
 * otherwise return the string false.
 * ---
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output
 * should return true because 4 + 6 + 10 + 3 = 23.
 * ---
 * The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 */

public class ArrayAdditionOne {
    private static int[] array;
    private static Boolean[][] cache;

    static boolean helper(int index, int curSum){
        if(curSum == 0) return true;
        if(curSum < 0 || index >= array.length) return false;

        if(cache[index][curSum] != null) return cache[index][curSum];

        boolean take = helper(index+1, curSum - array[index]);
        boolean skip = helper(index+1, curSum);
        cache[index][curSum] = take || skip;
        return cache[index][curSum];
    }

    static String arrayAdditionOne(int[] arr) {
        Arrays.sort(arr);
        int last = arr[arr.length - 1];
        array = new int[arr.length -1];
        System.arraycopy(arr, 0, array, 0, (arr.length - 1));
        cache = new Boolean[array.length][last + 1];
        boolean hasSum = helper(0,last);
        return (hasSum)? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(arrayAdditionOne(new int[] {4, 6, 23, 10, 1, 3}));
        System.out.println(arrayAdditionOne(new int[] {4, 6, 35, 10, 1, 3}));
        System.out.println(arrayAdditionOne(new int[] {4, 6, 13, 10, 1, 3}));
        System.out.println(arrayAdditionOne(new int[] {1, 3}));
    }
}
