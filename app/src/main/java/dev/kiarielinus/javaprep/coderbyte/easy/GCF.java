package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function GCF(arr) take the array of numbers stored in arr
 * which will always contain only two positive integers,
 * and return the greatest common factor of them.
 * ---
 * For example: if arr is [45, 12] then your program should return 3.
 * There will always be two elements in the array,
 * and they will be positive integers.
 */

public class GCF {
    static int gcf(int[] arr){
        int first = arr[0];
        int second = arr[1];
        int result = 1;
        for(int i = 1; i <= first && i <= second;i++){
            if(first % i == 0 && second % i == 0) result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gcf(new int[]{45,70}));
    }
}
