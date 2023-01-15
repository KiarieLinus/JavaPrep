package dev.kiarielinus.javaprep.arrays_strings.one_away;

//One Away: There are three types of edits that can be performed on strings: insert a character,
//        remove a character, or replace a character. Given two strings, write a function to check if they are
//        one edit (or zero edits) away.
//        EXAMPLE
//        pale, ple -> true
//        pales, pale -> true
//        pale, bale -> true
//        pale, bake -> false
public class OneAway {
    enum Longer {EQUAL, FIRST, SECOND}
    static boolean isOneAway(String s, String t) {
        Longer longer;
        int diff = s.length() - t.length();
        if (s.equals(t)) return false;
        if (diff > 1 || diff < -1) return false;
        if (diff > 0) longer = Longer.FIRST;
        else longer = diff < 0 ? Longer.SECOND : Longer.EQUAL;
        switch (longer) {
            case EQUAL: {
                boolean[] check = new boolean[s.length()];
                int falseCount = 0;
                for (int i = 0; i <= s.length() - 1; i++) {
                    check[i] = s.toCharArray()[i] == t.toCharArray()[i];
                }
                for (boolean b : check) {
                    if (!b) falseCount++;
                }
                return falseCount <= 1;
            }
            case FIRST: {
                return getResult(t, s);
            }

            case SECOND: {
                return getResult(s, t);
            }
        }

        return false;
    }

    private static boolean getResult(String shorter, String longer) {
        boolean[] check = new boolean[longer.length()];
        int falseCount = 0;
        for (int i = 0; i < longer.length() - 1; i++) {
            check[i] = shorter.toCharArray()[i] == longer.toCharArray()[i] ||
                    shorter.toCharArray()[i] == longer.toCharArray()[i + 1];
        }
        for (boolean b : check) {
            if (!b) falseCount++;
        }
        return falseCount <= 1;
    }

    public static void main(String[] args) {
//pale, ple -> true
        System.out.println("is true: " + isOneAway("pale", "ple"));
//pales, pale -> true
        System.out.println("is true: " + isOneAway("pales", "pale"));
//pale, bale -> true
        System.out.println("is true: " + isOneAway("pale", "bale"));
//pale, bake -> false
        System.out.println("is false: " + isOneAway("pale", "bake"));

    }
}
