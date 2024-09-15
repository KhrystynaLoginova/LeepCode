package org.example.medium;

import java.util.Arrays;

public class MaxNumber_1679 {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length - 1;
        int pairs = 0;
        while (i < n) {
            if (k - nums[i] == nums[n]) {
                pairs++;
                i++;
                n--;
            } else if (k - nums[i] > nums[n]) {
                i++;
            } else {
                n--;
            }
        }
        return pairs;
    }
}
