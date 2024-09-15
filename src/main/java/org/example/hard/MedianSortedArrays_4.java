package org.example.hard;

import java.util.ArrayList;
import java.util.List;

public class MedianSortedArrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        if (l1 == 0 && l2 != 0) {
            return getResult(nums2);
        } else if (l2 == 0 && l1 != 0) {
            return getResult(nums1);
        } else {
            List<Integer> merged = new ArrayList<>();
            merge(merged, nums1, 0, nums2, 0);
            return getResult(merged);
        }
    }

    public double getResult(int[] result) {
        int medianIdx = result.length / 2;
        int l3 = result.length;
        if (l3 % 2 == 0) {
            return (double) (result[medianIdx - 1] + result[medianIdx]) / 2;
        } else {
            return result[medianIdx];
        }
    }

    public double getResult(List<Integer> result) {
        int medianIdx = result.size() / 2;
        int l3 = result.size();
        if (l3 % 2 == 0) {
            return (double) (result.get(medianIdx - 1) + result.get(medianIdx)) / 2;
        } else {
            return result.get(medianIdx);
        }
    }

    private List<Integer> merge(List<Integer> result, int[] nums1, int count1, int[] nums2, int count2) {
        if (count1 < nums1.length) {

            if (count2 < nums2.length) {
                int v1 = nums1[count1];
                int v2 = nums2[count2];
                if (v1 < v2) {
                    result.add(v1);
                    count1++;
                } else if (v1 > v2) {
                    result.add(v2);
                    count2++;
                } else {
                    result.add(v1);
                    result.add(v2);
                    count1++;
                    count2++;
                }
            } else {
                while (count1 < nums1.length) {
                    result.add(nums1[count1]);
                    count1++;
                }
            }
        } else {
            if (count2 < nums2.length) {
                while (count2 < nums2.length) {
                    result.add(nums2[count2]);
                    count2++;
                }
            } else {
                return result;
            }
        }
        return merge(result, nums1, count1, nums2, count2);
    }
}
