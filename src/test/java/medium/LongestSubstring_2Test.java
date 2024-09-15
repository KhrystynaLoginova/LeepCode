package medium;

import org.example.medium.LongestSubstring_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestSubstring_2Test {
    private LongestSubstring_3 ls3;

    @BeforeEach
    public void before() {
        ls3 = new LongestSubstring_3();
    }

    @Test
    public void Test1() {
        Assertions.assertEquals(3, ls3.lengthOfLongestSubstring("dvdf"));
        Assertions.assertEquals(3, ls3.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(5, ls3.lengthOfLongestSubstring("tmmzuxt"));
        Assertions.assertEquals(3, ls3.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(7, ls3.lengthOfLongestSubstring("bpfbhmipx"));
    }
}
