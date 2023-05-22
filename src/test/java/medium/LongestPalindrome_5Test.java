package medium;

import org.example.medium.LongestPalindrome_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestPalindrome_5Test {
    private LongestPalindrome_5 lp5;
    @BeforeEach
    public void before() {
        lp5 = new LongestPalindrome_5();
    }
    @Test
    public void Test1() {
        Assertions.assertEquals("dvd", lp5.longestPalindrome("dvdf"));
    }

    @Test
    public void Test2() {
        Assertions.assertEquals("bb", lp5.longestPalindrome("cbbd"));
    }

    @Test
    public void Test3() {
        Assertions.assertEquals("bb", lp5.longestPalindrome("bb"));
    }
    @Test
    public void Test4ß() {
        Assertions.assertEquals("ddtattarrattatdd", lp5.longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
    }
}
