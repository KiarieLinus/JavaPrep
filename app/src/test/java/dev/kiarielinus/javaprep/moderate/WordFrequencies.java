package dev.kiarielinus.javaprep.moderate;

import java.util.HashMap;
import java.util.Locale;

//Word Frequencies: Design a method to find the frequency of occurrences of any given word in a
//        book. What if we were running this algorithm multiple times?
public class WordFrequencies {

    static int getFrequency(String[] book, String word){
        if(word == null || word.trim().isEmpty() || book == null) return  -1;
        word = word.trim().toLowerCase(Locale.ROOT);

        int count = 0;
        for(String s : book){
            if(s.equals(word)){
                count++;
            }
        }
        return count;
    }


    //SOLUTION 2
    static HashMap<String, Integer> setUpDictionary(String[] book){
        HashMap<String, Integer> table = new HashMap<>();

        for(String word : book){
            word = word.trim().toLowerCase(Locale.ROOT);
            if(!word.isEmpty() && !table.containsKey(word)){
                table.put(word,1);
            }else{
                table.put(word, table.get(word) +1);
            }
        }
        return table;
    }

    static int getFrequency2(HashMap<String, Integer> table,String word){
        if( table == null || word == null || word.trim().isEmpty()) return -1;
        word = word.toLowerCase(Locale.ROOT);
        if(table.containsKey(word)){
            return table.get(word);
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] book = {"ant", "book","cow","book"};
        System.out.println(getFrequency(book,"book"));
        System.out.println(getFrequency(book," "));
        System.out.println(getFrequency(book,null));
        System.out.println(getFrequency(book,"cow"));
        System.out.println(getFrequency(book,"boy"));
        System.out.println("----------------");

        HashMap<String, Integer> table = setUpDictionary(book);
        System.out.println(getFrequency2(table,"book"));
        System.out.println(getFrequency2(table,""));
        System.out.println(getFrequency2(table,null));
        System.out.println(getFrequency2(table,"cow"));
        System.out.println(getFrequency2(table,"boy"));
    }
}
