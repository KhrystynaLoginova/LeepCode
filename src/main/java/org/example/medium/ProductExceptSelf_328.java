package org.example.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductExceptSelf_328 {
    public Integer[] productExceptSelf(int[] nums) {
for (int in : nums) {
    System.out.print(in + " ");
}
        Integer[] products = new Integer[nums.length];
        products[0] = nums[0];

        for (int i = 1 ; i < nums.length; i++) {
            products[i] = nums[i-1] * nums[i];
        }
        System.out.println(Arrays.stream(products).collect(Collectors.toList()));

        return products;
    }
}
