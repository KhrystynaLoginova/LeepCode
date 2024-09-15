package org.example.medium;

public class ReverseWords_151 {
    public String reverseWords(String s) {
        String[] array = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(" ");
        }
        return result.toString().trim();
    }
}
