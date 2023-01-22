package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function FirstFactorial(num) take
 * the num parameter being passed and return the factorial of it.
 * For example: if num = 4, then your program
 * should return (4 * 3 * 2 * 1) = 24.
 * For the test cases, the range will be between 1 and 18
 * and the input will always be an integer.
 */

public class FirstFactorial {
    static long firstFactorial(int num){
        if(num == 0) return 1;
        if(num < 3) return  num;
        return num * firstFactorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(firstFactorial(8));
        System.out.println(firstFactorial(18));
    }
}
