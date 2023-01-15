package dev.kiarielinus.javaprep.arrays_strings.URLify;
//URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
//        has sufficient space at the end to hold the additional characters, and that you are given the "true"
//        length of the string. (Note: If implementing in Java, please use a character array so that you can
//        perform this operation in place.)
//        EXAMPLE
//        Input: "Mr John Smith ", 13
//        Output: "Mr%20John%20Smith"
public class URLify {

    static String toURL(String s){
        String stringT = s.trim();
        char[] chars = stringT.toCharArray();
        int spaces = 0,index;

        for (char c : chars) {
            if (c == ' ') {
                spaces++;
            }
        }
        index = stringT.length() + spaces *2;
        char[] chars1 = new char[index];
        for (int i = stringT.length()-1; i >= 0; i--) {
            if(chars[i] == ' '){
                chars1[index-1] = '0';
                chars1[index-2] = '2';
                chars1[index-3] = '%';
                index -= 3;
            }else{
                chars1[index-1] = chars[i];
                index--;
            }
        }

        return new String(chars1);
    }


    public static void main(String[ ] args) {
        System.out.println(toURL("Mr John Smith  "));
    }

}
