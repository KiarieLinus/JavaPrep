package dev.kiarielinus.javaprep.arrays_strings.string_compression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

//String Compression: Implement a method to perform basic string compression using the counts
//        of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
//        "compressed" string would not become smaller than the original string, your method should return
//        the original string. You can assume the string has only uppercase and lowercase letters (a - z).
public class StringCompression {

    static String toCompressed(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if(i+1>= s.length() || chars[i] != chars[i+1]){
                stringBuilder.append(chars[i]).append(count);
                count = 0;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCompressed("barabara"));
        System.out.println(toCompressed("aabcccDdccaaa"));
    }
}

//Frequency only
class GFG
{
    public static void countFreq(int[] arr, int n)
    {
        boolean[] visited = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    // Driver code
    public static void main(String []args)
    {
        int[] arr = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;
        countFreq(arr, n);
    }
}