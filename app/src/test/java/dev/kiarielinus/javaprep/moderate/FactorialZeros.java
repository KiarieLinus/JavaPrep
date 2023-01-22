package dev.kiarielinus.javaprep.moderate;


//Factorial zeros: Write an algorithm
// which computes the number of trailing zeros in n factorial.
public class FactorialZeros {
    /* If the number is a 5 of five, return which power of 5. For example: 5 -> 1,
     * 25-> 2, etc. */

    static int factorsOf5(int i) {
        int count = 0;
        while (i % 5 == 0) {
            count++;
            i /= 5;
        }
        return count;
    }

    static int countZeros(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            count += factorsOf5(i);
        }
        return count;
    }

    //Solution 2
    static int countZeros2(int num) {
        int count = 0;
        if (num < 0) return -1;
        for (int i = 5; num / i > 0; i *= 5) {
            count += num / i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countZeros(10));
        System.out.println(countZeros2(50));
    }
}
