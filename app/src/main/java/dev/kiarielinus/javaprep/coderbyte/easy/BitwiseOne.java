package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function BitwiseOne(strArr) take the array of strings stored in strArr,
 * which will only contain two strings of equal length that represent binary numbers,
 * and return a final binary string that performed the bitwise OR operation
 * on both strings.
 * ---
 * A bitwise OR operation places a 0 in the new string
 * where there are zeroes in both binary strings,
 * otherwise it places a 1 in that spot.
 * ---
 * For example: if strArr is ["1001", "0100"] then your program
 * should return the string "1101"
 */

public class BitwiseOne {
    static String bitwiseOne(String[] strArr) {
        if (strArr.length != 2) return "invalid";
        if (strArr[0].length() != strArr[1].length()) return "invalid";
        int val1 = Integer.parseInt(strArr[0], 2);
        int val2 = Integer.parseInt(strArr[1], 2);
        return Integer.toBinaryString(val1 | val2);
    }

    public static void main(String[] args) {
        System.out.println(bitwiseOne(new String[]{"1001", "0100"}));
        System.out.println(bitwiseOne(new String[]{"110001", "111100"}));
    }
}
