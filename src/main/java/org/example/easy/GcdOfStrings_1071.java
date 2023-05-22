package org.example.easy;

public class GcdOfStrings_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }
        int length = gcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
