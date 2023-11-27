package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class MaxAccountPerson {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int m = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                m += accounts[i][j];
            }
            result = Math.max(m, result);
        }
        return result;
    }
}
