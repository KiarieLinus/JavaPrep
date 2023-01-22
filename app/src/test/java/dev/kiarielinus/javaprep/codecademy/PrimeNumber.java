package dev.kiarielinus.javaprep.codecademy;

public class PrimeNumber {
    static boolean isPrime(int num) {
        if (num < 2) return false;
        int[] lowPrime = {2,3,5,7};
        for (int i: lowPrime) {
            if(num == i) return true;
            else {
                if(num % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(110));
    }
}
