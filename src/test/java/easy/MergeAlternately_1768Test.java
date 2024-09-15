package easy;

import org.example.easy.MergeAlternately_1768;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeAlternately_1768Test {
    private MergeAlternately_1768 ma1768;

    @BeforeEach
    public void before() {
        ma1768 = new MergeAlternately_1768();
    }

    @Test
    public void Test1() {
        Assertions.assertEquals("davbdcfd", ma1768.mergeAlternately("dvdf", "abcd"));
    }
}
