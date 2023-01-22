package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Arrays;

/**
 * Have the function LargestFour(arr) take the array of integers stored in arr,
 * and find the four largest elements and return their sum.
 * --
 * For example: if arr is [4, 5, -2, 3, 1, 2, 6, 6]
 * then the four largest elements in this array are 6, 6, 4, and 5
 * and the total sum of these numbers is 21, so your program should return 21.
 * --
 * If there are less than four numbers in the array your program
 * should return the sum of all the numbers in the array.
 */

public class LargestFour {
    static int largestFour(int[] arr){
        if(arr.length < 5) return Arrays.stream(arr).sum();
        Arrays.sort(arr);
        return Arrays.stream(Arrays.copyOfRange(arr,arr.length -4,arr.length)).sum();
//        int result = 0;
//        for(int i = arr.length -1; i > arr.length-5; i--){
//            result += arr[i];
//        }
//        return result;
    }

    public static void main(String[] args) {
        System.out.println(largestFour(new int[]{4, 5, -2, 3, 1, 2, 6, 6}));
        System.out.println(largestFour(new int[]{5, 6, 10, 12, 1, 1, 1, 5}));
        System.out.println(largestFour(new int[]{4, 5, -2, 3}));
    }
}
