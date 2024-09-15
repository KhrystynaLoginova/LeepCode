package org.example.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Difference_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> answer0 = new HashSet<>();
        Set<Integer> answer1 = new HashSet<>();

        boolean[] inx1 = new boolean[2002];
        for (int num : nums1) {
            inx1[1000 + num] = true;
        }
        boolean[] inx2 = new boolean[2002];
        for (int num : nums2) {
            inx2[1000 + num] = true;
            if (!inx1[1000 + num]) {
                answer1.add(num);
            }
        }

        for (int num : nums1) {
            if (!inx2[1000 + num]) {
                answer0.add(num);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(answer0));
        result.add(new ArrayList<>(answer1));
        return result;
    }
}
