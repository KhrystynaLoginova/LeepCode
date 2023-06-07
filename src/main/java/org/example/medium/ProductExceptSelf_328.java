package org.example.medium;


public class ProductExceptSelf_328 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] result = new int[len];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
                suffix[len - 1] = nums[len - 1];
            } else {
                prefix[i] = prefix[i - 1] * nums[i];
                suffix[len - 1 - i] = suffix[len - i] * nums[len - 1 - i];
            }
        }

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                result[i] = suffix[i + 1];
            } else if (i == len - 1) {
                result[i] = prefix[len - 2];
            } else {
                result[i] = prefix[i - 1] * suffix[i + 1];
            }
        }

        return result;
    }
}
