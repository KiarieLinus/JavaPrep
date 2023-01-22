package dev.kiarielinus.javaprep.bithacks;

import java.util.ArrayList;
import java.util.List;

public class BitHacks {
    public static void KthBit(int num, int k) {
        //1. Set kth bit in a word x to 1
        //Idea: Shift and OR
        int result = num | (1 << k); //Set kth bit
        System.out.println("set kth -> resultI: " + result + " | " +
                "0b-num: " + Integer.toBinaryString(num) + " | " +
                "0b-result: " + Integer.toBinaryString(result));

        //2. clear kth bit in a word x
        //Idea: Shift, complement, and AND
        result = result & ~(1 << k);
        System.out.println("clear kth -> numI: "+ num +" resultI: " + result );

        //3. Flip/toggle kth bit
        //Idea: Shift and XOR
        result = num ^ (1 << k);
        System.out.println("flip kth -> resultI: " + result + " | " +
                "0b-num: " + Integer.toBinaryString(num) + " | " +
                "0b-result: " + Integer.toBinaryString(result));
    }

    public static void extractABit(){
        //4. Extract a bit field from a word x
        //Idea: mask and shift
        int num = 48493; // 1011110101101101
        int shift = 7;
        int mask = 15 << shift; //11110000000
        int result = (num & mask) >> shift; //1010
        System.out.println("extracted -> resultI: " + result + " | " +
                "0b-num: " + Integer.toBinaryString(num) + " | " +
                "0b-result: " + Integer.toBinaryString(result));
    }

    ArrayList<Integer> Try(){
        return new ArrayList<>(-1);
    }

    public static void main(String[] args) {
        int x = 150; // 10010110
        KthBit(150, 5);
        extractABit();

    }
}
