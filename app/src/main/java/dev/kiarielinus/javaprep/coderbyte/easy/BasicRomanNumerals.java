package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.HashMap;

/**
 * Have the function BasicRomanNumerals(str) read str which will be a string of Roman numerals.
 * The numerals being used are: I for 1, V for 5, X for 10, L for 50,
 * C for 100, D for 500 and M for 1000.
 * In Roman numerals, to create a number like 11 you simply add a 1 after the 10,
 * so you get XI. But to create a number like 19, you use the subtraction notation
 * which is to add I before an X or V (or add an X before an L or C).
 * So 19 in Roman numerals is XIX.
 * ---
 * The goal of your program is to return the decimal equivalent of the Roman numeral given.
 * For example: if str is "XXIV" your program should return 24
 */

public class BasicRomanNumerals {
    static int getDecimal(String str){
        StringBuilder sb = new StringBuilder(str).reverse();
        char[] chars = new String(sb).toCharArray();
        int result = mapper(chars[0]);

        for(int i = 0; i < chars.length -1; i++){
            if(mapper(chars[i]) <= mapper(chars[i+1])){
                result += mapper(chars[i+1]);
                continue;
            }
            result -= mapper(chars[i+1]);
        }

        return result;
    }

    static int mapper(char ch){
        HashMap<Character,Integer> romanDec = new HashMap<>();
        romanDec.put('I',1);
        romanDec.put('V',5);
        romanDec.put('X',10);
        romanDec.put('L',50);
        romanDec.put('C',100);
        romanDec.put('D',500);
        romanDec.put('M',1000);

        return romanDec.get(ch);
    }

    public static void main(String[] args) {
        System.out.println(getDecimal("XXIV"));
        System.out.println(getDecimal("XXXVIII"));
        System.out.println(getDecimal("XLIX"));
        System.out.println(getDecimal("I"));
        System.out.println(getDecimal("MMM"));
    }
}
