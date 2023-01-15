package dev.kiarielinus.javaprep.arrays_strings.is_unique;

//Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?

public class IsUnique {
    boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            //val gets the integer value of a character
            int val = str.toLowerCase().charAt(i);
            if (char_set[val]){
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }


    boolean isUniqueChars2(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker = checker | (1 << val);
        }
        return true;
    }
}
