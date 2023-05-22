package org.example.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int space = 0;
        int plants = 0;
        int oldPlants = 0;
        for (int j : flowerbed) {

            if (j == 1) {
                if (space > 1) {
                    if (oldPlants == 0) {
                        plants += Math.floor((double) space / 2);
                    } else {
                        plants += Math.floor((double) ((space + 1) / 2) - 1);
                    }
                }
                space = 0;
                oldPlants++;
            } else {
                space++;
            }
        }
        if (space > 1) {
            plants += Math.floor((double) space / 2);
        } else {
            if (space == flowerbed.length) {
                plants += space;
            }
        }
        return n <= plants;
    }
}
