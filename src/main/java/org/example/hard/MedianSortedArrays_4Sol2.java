package org.example.hard;

public class MedianSortedArrays_4Sol2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        if (l1 == 0 && l2 != 0) {
            return getResult(nums2);
        } else if (l2 == 0 && l1 != 0) {
            return getResult(nums1);
        } else {
            int l3 = l1 + l2;
            if (l3 % 2 == 0) {
                int idx = l3 / 2 + 1;
                int[] merged = new int[idx];
                merge(merged, nums1, 0, nums2, 0, 0);
                return (double) (merged[idx - 2] + merged[idx - 1]) / 2;
            } else {
                int idx =  (int) Math.ceil((double) l3 / 2);
                int[] merged = new int[idx];
                merge(merged, nums1, 0, nums2, 0, 0);
                return merged[idx - 1];
            }
        }
    }

    public double getResult(int[] result) {
        int l3 = result.length;
        int medianIdx = l3 / 2;
        if (l3 % 2 == 0) {
            return (double) (result[medianIdx - 1] + result[medianIdx]) / 2;
        } else {
            return result[medianIdx];
        }
    }

    private int[] merge(int[] result, int[] nums1, int count1, int[] nums2, int count2, int count3) {
        if (count3 == result.length) {
            return result;
        }
        if (count1 < nums1.length) {
            int v1 = nums1[count1];
            if (count2 < nums2.length) {
                int v2 = nums2[count2];
                if (v1 < v2) {
                    result[count3] = v1;
                    count3++;
                    count1++;
                } else if (v1 > v2) {
                    result[count3] = v2;
                    count2++;
                    count3++;
                } else {
                    result[count3] = v1;
                    count3++;
                    count1++;
                }
            } else {
                result[count3] = v1;
                count1++;
                count3++;
            }
        } else {
            if (count2 < nums2.length) {
                result[count3] = nums2[count2];
                count2++;
                count3++;
            } else {
                return result;
            }
        }
        return merge(result, nums1, count1, nums2, count2, count3);
    }
}
