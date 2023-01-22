package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Collections;

/**
 * Have the function BinaryReversal(str) take the str parameter being passed,
 * which will be a positive integer, take its binary representation
 * (padded to the nearest N * 8 bits), reverse that string of bits,
 * and then finally return the new reversed string in decimal form.
 * ---
 * For example: if str is "47" then the binary version of this integer is 101111,
 * but we pad it to be 00101111. Your program should reverse this binary string
 * which then becomes: 11110100 and then finally return
 * the decimal version of this string, which is 244.
 */

public class BinaryReversal {
    static String binaryReversal(String str){
        String binary;
        try {
            binary = Integer.toBinaryString(Integer.parseInt(str));
            int repeat = 8 - (binary.length() % 8);
            StringBuilder sb = new StringBuilder(binary).reverse();
//            sb.append("0".repeat(repeat));//java 11
            sb.append(String.join("",Collections.nCopies(repeat,"0")));
            return new String(sb);
        }catch (Exception e){
            return "invalid input";
        }
    }

    public static void main(String[] args) {
        System.out.println(binaryReversal("47"));
    }
}
