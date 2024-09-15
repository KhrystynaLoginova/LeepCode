package easy;

import org.example.easy.GcdOfStrings_1071;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GcdOfStrings_1071Test {
    private GcdOfStrings_1071 gos1071;

    @BeforeEach
    public void before() {
        gos1071 = new GcdOfStrings_1071();
    }

    @Test
    public void Test1() {
        Assertions.assertEquals("abcd", gos1071.gcdOfStrings("abcdabcd", "abcd"));
    }

    @Test
    public void Test2() {
        Assertions.assertEquals("abc", gos1071.gcdOfStrings("abcabcabc", "abcabcabcabc"));
    }

    @Test
    public void Test3() {
        Assertions.assertEquals("abc", gos1071.gcdOfStrings("abcabc", "abc"));
    }

    @Test
    public void Test4() {
        Assertions.assertEquals("ab", gos1071.gcdOfStrings("ababab", "abab"));
    }
}
