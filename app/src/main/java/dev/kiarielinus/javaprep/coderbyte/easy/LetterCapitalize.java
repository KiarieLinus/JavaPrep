package dev.kiarielinus.javaprep.coderbyte.easy;

public class LetterCapitalize {
    static String letterCapitalize(String str){
        String[] words = str.split(" ");
        for(int i = 0; i < words.length;i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        System.out.println(letterCapitalize("The universe is change; our life is what our thoughts make it."));
    }
}
