package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Have the function ArithGeo(arr) take the array of numbers stored in arr
 * and return the string "Arithmetic" if the sequence follows an arithmetic pattern
 * or return "Geometric" if it follows a geometric pattern.
 * ---
 * If the sequence doesn't follow either pattern return -1.
 * An arithmetic sequence is one where the difference between
 * each of the numbers is consistent, where in a geometric sequence,
 * each term after the first is multiplied by some constant or common ratio.
 * ---
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered,
 * and no array will contain all the same elements.
 */
public class ArithGeo {
    static Boolean isGeometric(int sum, int first, int r, int n) {
        double geoSum = (first - (first * Math.pow(r, n))) / (1 - r);
        return geoSum == sum;
    }

    static Boolean isArithmetic(int sum, int first, int last, int n) {
        double arithSum = (first + last) * (n / 2d);
        return arithSum == sum;
    }

    static String arithGeo(int[] numbs) {
        int sum = 0;
        for (int i : numbs) {
            sum += i;
        }
        int n = numbs.length;

        if (isArithmetic(sum, numbs[0], numbs[n - 1], n)) return "Arithmetic";

        int r = numbs[1] / numbs[0];
        if (isGeometric(sum, numbs[0], r, n)) return "Geometric";

        return "-1";
    }


    public static void main(String[] args) {
        System.out.println(arithGeo(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(arithGeo(new int[]{2, 4, 8, 16, 32}));
        System.out.println(arithGeo(new int[]{-2, -4, -8, -16, -32}));
        System.out.println(arithGeo(new int[]{1, 3, 4, 5, 6, 9}));
        System.out.println(arithGeo(new int[]{-3, -4, -5, -6, -7}));
    }
}
