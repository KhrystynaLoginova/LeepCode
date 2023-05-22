package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -1;
        List<Integer> ac = new ArrayList<>();

        for (int candy : candies) {
            result.add(false);
            ac.add(candy + extraCandies);
            if (candy > max) {
                max = candy;
            }
        }
        for (int i =0 ; i < ac.size(); i++) {
            if (ac.get(i) >= max) {
                result.set(i, true);
            }
        }
        return result;
    }
}
