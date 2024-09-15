package org.example.easy;

import java.util.HashSet;
import java.util.Set;

public class PivotIndex_724 {
    public int pivotIndex(int[] nums) {
        Set<Integer> s2 = new HashSet<>();
        for (int num : nums) {
            s2.add(num);
        }

        int l = nums.length;
        int[] sums = new int[l];
        for (int i = 0; i < l; i++) {
            if (i == 0) {
                sums[i] = nums[i];
            } else {
                sums[i] = sums[i - 1] + nums[i];
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < l; i++) {
            sum2 = sums[l - 1] - sums[i];
            sum1 = sums[i] - nums[i];
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }
}
