package org.example.medium;

public class StringCompression_443 {
    public int compress(char[] chars) {
        int l = 0;
        int count = 0;
        char prev = '\u0000';
        for (int i = 0; i < chars.length; i++) {
            if (count == 0) {
                chars[l] = chars[i];
                l++;

                count = 1;
                prev = chars[i];
            } else if (prev != chars[i]) {
                l = addAmount(count, chars, l);

                chars[l] = chars[i];
                l++;

                count = 1;
                prev = chars[i];
            } else {
                count++;
            }
        }

        l = addAmount(count, chars, l);
        return l;
    }

    private int addAmount(int count, char[] chars, int l) {
        if (count > 1) {
            char[] array = (String.valueOf(count)).toCharArray();
            for (char c : array) {
                chars[l] = c;
                l++;
            }
        }
        return l;
    }
}
