package dev.kiarielinus.javaprep.moderate;

import java.util.Arrays;

//Smallest Difference: Given two arrays of integers, compute the pair of values (one value in each
//        array) with the smallest (non-negative) difference. Return the difference.
//        EXAMPLE
//        Input: {1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
//        Output:
//        3. That is, the pair (11, 8).
public class SmallestDifference {
    //Brute Force approach
    static int getSDifference1(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0) return -1;
        int difference = -1;
        for (int j : array1) {
            for (int k : array2) {
                if (difference == 0)
                    break;

                int currentDiff = Math.abs(j - k);
                if (difference == -1 || currentDiff < difference) {
                    difference = currentDiff;
                }
            }
        }
        return difference;
    }

    //Optimal approach
    static int getSDifference2(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        int a = 0;
        int b = 0;
        int difference = Integer.MAX_VALUE;

        while (a < array1.length && b < array2.length) {
            if (Math.abs(array1[a] - array2[b]) < difference) {
                difference = Math.abs(array1[a] - array2[b]);
            }

            /*Move Smaller value*/
            if (array1[a] < array2[b]) {
                a++;
            } else {
                b++;
            }
        }
        return difference;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 15, 11, 2};
        int[] nums2 = {23, 127, 235, 19, 8};

        System.out.println(getSDifference1(nums1, nums2));
        System.out.println(getSDifference2(nums1, nums2));
    }
}













