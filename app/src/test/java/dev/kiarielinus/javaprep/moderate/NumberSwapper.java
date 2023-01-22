package dev.kiarielinus.javaprep.moderate;

//Number Swapper: Write a function to swap a number in place
// (that is, without temporary variables).
public class NumberSwapper {
    static void swapper(int a, int b) {
        if (a != b) {
            a = b + a;
            b = a - b;
            a = a - b;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
    }

    //Solution 2
    static void swapper2(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("--XOR operator--");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        swapper(4, 5);
        swapper(6,6);
        swapper(7,10);
        swapper2(11,50);
        //Output
        //a = 5
        //b = 4
        //
        //a = 6
        //b = 6
        //
        //a = 10
        //b = 7
    }
}
