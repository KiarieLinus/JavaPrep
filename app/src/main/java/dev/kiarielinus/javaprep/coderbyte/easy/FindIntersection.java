package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Have the function FindIntersection(strArr) read the array of strings
 * stored in strArr which will contain 2 elements: the first element
 * will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing
 * the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 */

public class FindIntersection {

    private static String findIntersection(String[] strArr) {
        int[] intArr1 = Arrays.stream(strArr[0].split(","))
                .mapToInt(str -> Integer.parseInt(str.trim())).toArray();
        int[] intArr2 = Arrays.stream(strArr[1].split(","))
                .mapToInt(str -> Integer.parseInt(str.trim())).toArray();
        List<Integer> list = new ArrayList<>();
        for (int i : (intArr1.length < intArr2.length) ? intArr2 : intArr1) {
            int[] temp = (intArr1.length < intArr2.length) ? intArr1 : intArr2;
            if (Arrays.stream(temp).anyMatch(num -> num == i)) {
                list.add(i);
            }
        }
        return (list.isEmpty()) ? "false" : list.stream().map(String::valueOf).collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        System.out.println(findIntersection(new String[]{"11, 12, 14, 16, 20", "11, 12, 13, 18, 21"}));
        System.out.println(findIntersection(new String[]{"1, 3, 4, 7, 13, 15", "1, 2, 4, 13, 15"}));
        System.out.println(findIntersection(new String[]{"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"}));
    }
}
