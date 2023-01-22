package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function AdditivePersistence(num) take the num parameter being passed
 * which will always be a positive integer
 * and return its additive persistence which is the number of times
 * you must add the digits in num until you reach a single digit.
 * ---
 * For example: if num is 2718 then your program
 * should return 2 because 2 + 7 + 1 + 8 = 18
 * and 1 + 8 = 9, and you stop at 9.
 */
public class AdditivePersistence {
    static int additivePersistence(int num){
        char[] chars = String.valueOf(num).toCharArray();
        int result = 0,sum = 0;
        for(int i = chars.length -1; i > 0; i--){
            sum += chars[i] -'0';
            if(sum>9){
                return result;
            }
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(additivePersistence(4144));//3
        System.out.println(additivePersistence(2718));//2
        System.out.println(additivePersistence(4));//0
        System.out.println(additivePersistence(29));//1
    }
}
