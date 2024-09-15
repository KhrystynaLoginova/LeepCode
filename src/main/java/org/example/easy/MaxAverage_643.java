package org.example.easy;

public class MaxAverage_643 {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= k - 1) {
                sum += nums[i];
            } else {
                max = Math.max(max, sum);
                sum -= nums[i - k];
                sum += nums[i];
            }
        }
        max = Math.max(max, sum);

        return (double) max / k;
    }
}
