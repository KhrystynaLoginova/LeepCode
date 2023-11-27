package org.example;

import org.example.easy.RansomNote_383;
import org.example.medium.LongestSubstring_3;
import org.example.medium.MaxNumber_1679;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MaxNumber_1679 mn = new MaxNumber_1679();
        int[] nums = new int[] {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        mn.maxOperations(nums, 3);
    }
}