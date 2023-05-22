package org.example.medium;

public class LongestSubstring_3 {
    public int lengthOfLongestSubstring(String initialString) {
        int result = 0;
        String resultString = "";
        for (int i = 0; i < initialString.length(); i++) {
            char currentChar = initialString.charAt(i);
            int dupIdx = resultString.indexOf(currentChar);
            if (dupIdx >= 0) {
                result = Math.max(resultString.length(), result);
                resultString = resultString.substring(dupIdx + 1);
            }
            resultString += currentChar;
        }
        return Math.max(resultString.length(), result);
    }
}
