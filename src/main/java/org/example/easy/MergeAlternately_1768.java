package org.example.easy;

public class MergeAlternately_1768 {
    public String mergeAlternately(String word1, String word2) {
        return merge(word1, word2);
    }

    private String merge(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int num1 = 0, num2 = 0;

        StringBuilder resultBuilder = new StringBuilder();
        while (num1 < len1 && num2 < len2) {
            resultBuilder.append(word1.charAt(num1));
            num1++;

            resultBuilder.append(word2.charAt(num2));
            num2++;
        }
        while (num1 < len1) {
            resultBuilder.append(word1.charAt(num1));
            num1++;

        }
        while (num2 < len2) {
            resultBuilder.append(word2.charAt(num2));
            num2++;
        }

        return resultBuilder.toString();
    }
}
