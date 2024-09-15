package org.example.medium;

import java.util.Arrays;
import java.util.List;

public class MaxVowels_1456 {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        char[] input = s.toCharArray();
        int accumulator = 0;
        int max = Integer.MIN_VALUE;
        boolean[] findInx = new boolean[input.length];

        System.out.println("string=" + s);


        for (int i = 0; i < input.length; i++) {

            if (i > k - 1) {
                max = Math.max(max, accumulator);
                if (findInx[i - k]) {
                    accumulator--;
                }
            }
            if (vowels.indexOf(input[i]) > -1) {
                accumulator++;
                findInx[i] = true;
            }
            List.of(findInx).stream().forEach(b -> System.out.println(b));
        }
        max = Math.max(max, accumulator);
        return max;
    }
}
