package dev.kiarielinus.javaprep.coderbyte.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Have the function MeanMode(arr) take the array of numbers stored in arr
 * and return 1 if the mode equals the mean, 0 if they don't equal each other
 * (i.e. [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)).
 * The array will not be empty, will only contain positive integers,
 * and will not contain more than one mode.
 */

public class MeanMode {
    static int meanMode(int[] arr) {
        int sum = 0;
        int mode = 0;
        HashMap<Integer, Integer> mapper = new HashMap<>();
        for (int i : arr) {
            if (mapper.containsKey(i)) {
                mapper.put(i, mapper.get(i) + 1);
                sum += i;
                continue;
            }
            mapper.put(i, 1);
            sum += i;
        }

        for (int i : mapper.keySet()) {
            if (mode < mapper.get(i)) mode = mapper.get(i);
        }
        double mean = ((double) sum / arr.length);
        return (mode == mean) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(meanMode(new int[]{5, 3, 3, 3, 1}));
        System.out.println(meanMode(new int[]{5}));
    }
}
