package org.example.medium;

import org.apache.commons.lang3.StringUtils;

public class LongestPalindrome_5 {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String max = StringUtils.EMPTY;
        for (int i = 0; i < s.length() - 1; i++) {
            String max1 = getLongestOdd(s, i);
            String max2 = getLongestEven(s, i, i + 1);
            if (max1.length() > max.length()) {
                max = max1;
            }
            if (max2.length() > max.length()) {
                max = max2;
            }
        }
        return max;
    }

    private String getLongestOdd(String s, int median) {
        int i = median;
        int j = median;
        while (i >= 0 && j <= s.length() - 1 && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(++i, j);
    }

    private String getLongestEven(String s, int median1, int median2) {
        int i = median1;
        int j = median2;
        while (i >= 0 && j <= s.length() - 1 && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(++i, j);
    }
}
