package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Collections;

/**
 * Have the function BitwiseTwo(strArr) take the array of strings stored in strArr,
 * which will only contain two strings of equal length that represent binary numbers,
 * and return a final binary string that performed the bitwise AND operation on both strings.
 * ---
 * A bitwise AND operation places a 1 in the new string where
 * there is a 1 in both locations in the binary strings,
 * otherwise it places a 0 in that spot. For example:
 * if strArr is ["10111", "01101"] then your program should return the string "00101"
 */

class BitwiseTwo {

    static String bitwiseTwo(String[] strArr) {
        if (strArr.length != 2) return "invalid";
        if (strArr[0].length() != strArr[1].length()) return "invalid";
        int first = Integer.parseInt(strArr[0], 2);
        int second = Integer.parseInt(strArr[1], 2);
        String result = Integer.toBinaryString(first & second);
        if (result.length() == strArr[0].length()) {
            return result;
        } else {
            int repeat = strArr[1].length() - result.length();
            return String.join("", Collections.nCopies(repeat, "0")) + result;
        }
    }

    public static void main(String[] args) {
        System.out.println(bitwiseTwo(new String[]{"10111", "01101"}));
    }
}
