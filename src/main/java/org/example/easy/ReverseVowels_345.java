package org.example.easy;

import java.util.List;

public class ReverseVowels_345 {
    public String reverseVowels(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'u', 'o', 'A', 'E', 'I', 'U', 'O');
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length;
        while (start != end) {
            if (vowels.contains(charArray[start]) && vowels.contains(charArray[end])) {
                char tmp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = tmp;
                start++;
                end--;
            } else if (vowels.contains(charArray[start]) && !vowels.contains(charArray[end])) {
                end--;
            } else if (!vowels.contains(charArray[start]) && vowels.contains(charArray[end])) {
                start++;
            } else {
                start++;
                end--;
            }
        }
        return new String(charArray);
    }
}
