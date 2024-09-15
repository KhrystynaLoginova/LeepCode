package org.example.medium;

import java.util.LinkedList;
import java.util.Queue;

public class MaxOnes_1004 {
    public int longestOnes(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int accumulator = 0;
        Queue<Integer> integerQueue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                accumulator++;
            } else {
                if (integerQueue.size() < k) {
                    accumulator++;
                } else {
                    int idx = integerQueue.poll();
                    max = Math.max(accumulator, max);
                    accumulator = i - idx;
                }
                integerQueue.add(i);
            }
        }
        max = Math.max(accumulator, max);
        return max;
    }
}
