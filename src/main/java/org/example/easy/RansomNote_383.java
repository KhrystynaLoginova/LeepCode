package org.example.easy;

public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[128];
        char[] validateArr = ransomNote.toCharArray();
        for (int i = 0; i < validateArr.length; i++) {
            System.out.println(i);
            int idx = magazine.indexOf(validateArr[i], letters[validateArr[i]]);
            System.out.println(validateArr[i]);
            System.out.println(idx);
            System.out.println(letters);

            if (idx < 0) {
                return false;
            } else {
                letters[validateArr[i]] = idx + 1;
            }
        }

        return true;
    }
}
